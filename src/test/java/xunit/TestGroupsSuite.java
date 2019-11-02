package xunit;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import xunit.FastGruops;
import xunit.SlowGroups;

@RunWith(Categories.class)
@Categories.IncludeCategory(SlowGroups.class)
@Categories.ExcludeCategory(FastGruops.class)
@Suite.SuiteClasses({
        TestGroups.class
})

public class TestGroupsSuite {
}
