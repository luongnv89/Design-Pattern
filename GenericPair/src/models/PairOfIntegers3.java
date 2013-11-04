package models;

import java.util.ArrayList;

import abstractions.PairOfIntegersAbstraction;

public class PairOfIntegers3 extends PairOfIntegersAbstraction {

	ArrayList<Integer> pair;

	public PairOfIntegers3() {
		super();
	}

	public PairOfIntegers3(Integer first, Integer second) {
		super(first, second);
	}

	public PairOfIntegers3(PairOfIntegers3 other) {
		super(other);
	}

	@Override
	public Integer getFirst() {
		return pair.get(0);
	}

	@Override
	public Integer getSecond() {
		return pair.get(1);
	}

	@Override
	public void swap() {
		super.swap();
	}

	@Override
	public void setFirst(Object first) throws IllegalArgumentException {
		if (!(first instanceof Integer))
			throw (new IllegalArgumentException("Cannot assign a non Integer"));
		else {
			if (pair == null) {
				pair = new ArrayList<>();
				pair.add(0);
				pair.add(0);
			}
			pair.set(0, (Integer) first);
		}

	}

	@Override
	public void setSecond(Object second) {
		if (!(second instanceof Integer))
			throw (new IllegalArgumentException("Cannot assign a non Integer"));
		else
			pair.set(1, (Integer) second);

	}
}
