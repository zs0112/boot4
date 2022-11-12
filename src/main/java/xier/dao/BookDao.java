package xier.dao;

import xier.domain.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 希儿
 * @since 2022-11-08
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {

}
