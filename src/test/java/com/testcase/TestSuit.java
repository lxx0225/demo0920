package com.testcase;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(SlowInteface.class)
@Suite.SuiteClasses({
        TestCategory.class
})
public class TestSuit {
}
