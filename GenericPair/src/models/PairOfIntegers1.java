package models;

import abstractions.PairOfIntegersAbstraction;

public class PairOfIntegers1 extends PairOfIntegersAbstraction {

	GenericPair<Integer> pair;

	public PairOfIntegers1() {
		super();
	}

	public PairOfIntegers1(Integer first, Integer second) {
		super(first, second);
	}

	public PairOfIntegers1(PairOfIntegers1 other) {
		super(other);
	}

	@Override
	public Integer getFirst() {
		return pair.first;
	}

	@Override
	public Integer getSecond() {
		return pair.second;
	}

	@Override
	public void swap() {
		pair.swap();
	}

	@Override
	public void setFirst(Object first) throws IllegalArgumentException {
		if (!(first instanceof Integer))
			throw (new IllegalArgumentException("Cannot assign a non Integer"));
		else {
			if (pair == null) {
				pair = new GenericPair<Integer>(0, 0);
			}
			pair.setFirst((Integer) first);
		}

	}

	@Override
	public void setSecond(Object second) {
		if (!(second instanceof Integer))
			throw (new IllegalArgumentException("Cannot assign a non Integer"));
		else
			pair.setSecond((Integer) second);

	}

}
