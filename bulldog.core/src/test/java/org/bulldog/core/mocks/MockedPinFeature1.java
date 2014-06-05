package org.bulldog.core.mocks;

import org.bulldog.core.gpio.Pin;
import org.bulldog.core.gpio.base.AbstractPinFeature;

public class MockedPinFeature1 extends AbstractPinFeature {

	public MockedPinFeature1(Pin pin) {
		super(pin);
	
	}

	@Override
	public String getName() {
		return "Mocked Feature";
	}

	@Override
	public void setup() {
	}

	@Override
	public void teardown() {
	}
}
