package com.test.wisen;

import java.util.*;
import java.util.concurrent.*;

public class Stats {
	public static class StatisticsAggregatorImpl implements StatisticsAggregator {

		ConcurrentHashMap<String, ArrayList<Double>> pricesMap = new ConcurrentHashMap<String, ArrayList<Double>>();
		ArrayList<Double> priceList = null;
		volatile int count = 0;

		@Override
		public synchronized void putNewPrice(String symbol, double price) {
			if (pricesMap.containsKey(symbol)) {
				priceList = pricesMap.get(symbol);
			} else {
				priceList = new ArrayList<Double>();
			}
			priceList.add(price);
			pricesMap.put(symbol, priceList);

		}

		@Override
		public synchronized double getAveragePrice(String symbol) {
			ArrayList<Double> tmp = pricesMap.get(symbol);
			count = tmp.size();
			Double price = 0.0;
			for (Double d : pricesMap.get(symbol)) {
				price += d;
			}
			return price / count;
		}

		@Override
		public synchronized int getTickCount(String symbol) {
			return count;
		}
	}

	////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

	public interface StatisticsAggregator {
		// This is an input. Make note of this price.
		public void putNewPrice(String symbol, double price);

		// Get the average price
		public double getAveragePrice(String symbol);

		// Get the total number of prices recorded
		public int getTickCount(String symbol);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			final StatisticsAggregator stats = new StatisticsAggregatorImpl();
			final Set<String> symbols = new TreeSet<>();

			String line = scanner.nextLine();
			String[] inputs = line.split(",");
			int threads = Integer.parseInt(inputs[0]);
			ExecutorService pool = Executors.newFixedThreadPool(threads);
			for (int i = 1; i < inputs.length; ++i) {
				String[] tokens = inputs[i].split(" ");
				final String symbol = tokens[0];
				symbols.add(symbol);
				final double price = Double.parseDouble(tokens[1]);
				pool.submit(new Runnable() {
					@Override
					public void run() {
						stats.putNewPrice(symbol, price);
					}
				});

			}
			pool.shutdown();
			try {
				pool.awaitTermination(5000, TimeUnit.MILLISECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			for (String symbol : symbols) {
				System.out.println(
						String.format("%s %.4f %d", symbol, stats.getAveragePrice(symbol), stats.getTickCount(symbol)));
			}
		}
		scanner.close();

	}
}