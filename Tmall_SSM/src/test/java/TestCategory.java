import cn.wmyskxz.mapper.CategoryMapper;
import cn.wmyskxz.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class TestCategory {

    @Autowired
    CategoryMapper categoryMapper;
    @Test
    public void test() {
        Category category = new Category();
        category.setName("分类1");
        categoryMapper.insert(category);
    }
}
