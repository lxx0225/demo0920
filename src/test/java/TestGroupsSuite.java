import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(SlowGroups.class)
@Categories.ExcludeCategory(FastGruops.class)
@Suite.SuiteClasses({
        TestGroups.class
})

public class TestGroupsSuite {
}
