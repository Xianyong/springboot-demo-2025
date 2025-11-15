package cn.edu.gzist.cs.demo.devenv.mapper;

import cn.edu.gzist.cs.demo.devenv.entity.Goods;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsMapper extends BaseMapper<Goods> {
}
