<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.${subpackage}.service.impl;

import com.wpc.common.base.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ${basepackage}.${subpackage}.dao.${className}Dao;
import ${basepackage}.${subpackage}.model.${className};
import ${basepackage}.${subpackage}.service.${className}Service;

/**
 * 功能描述: 
 * @Author: 王鹏程 
 * @E-mail: wpcfree@qq.com @QQ: 376205421
 * @Blog: http://www.wpcfree.com
 * @Date:
 */
@Service
public class ${className}ServiceImpl extends BaseServiceImpl<${className}, Long> implements ${className}Service {

    @Autowired
    private ${className}Dao ${classNameLower}Dao;
    
}
