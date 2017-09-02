package io.o2o.modules.oss.dao;

import io.o2o.modules.oss.entity.SysOssEntity;
import io.o2o.modules.sys.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文件上传
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-25 12:13:26
 */
@Mapper
public interface SysOssDao extends BaseDao<SysOssEntity> {
	
}
