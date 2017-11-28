package com.example.assertions;

import com.example.models.SWCollection;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

public class SWCollectionAssertion extends AbstractAssert<SWCollectionAssertion, SWCollection> {

    private int count;

    private SWCollectionAssertion(SWCollection collection, Class<?> selfType) {
        super(collection, selfType);
    }

    public static final SWCollectionAssertion assertThat(final SWCollection actual) {
        return new SWCollectionAssertion(actual, SWCollectionAssertion.class);
    }

    // Here custom assertion methods starts
    public SWCollectionAssertion hasCount(final int expectedCount) {
        Assertions.assertThat(actual.getCount()).isEqualTo(expectedCount);
                //actual.getCount() (expectedCount);
        return this;
    }
}
