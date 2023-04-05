package com.dragondj;

import com.dragondj.passcs.question.entity.TypeEntity;
import com.dragondj.passcs.question.service.TypeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PasscsQuestionApplicationTests {

    @Autowired
    TypeService service ;
    @Test
    void contextLoads() {
    }
    @Test
    void testCreateTypeService() {
        TypeEntity typeEntity = new TypeEntity();
        typeEntity.setType("javaBasic");
        service.save(typeEntity);
        System.out.println("创建成功");
    }

    @Test
    void testUpdateTypeService() {
        TypeEntity typeEntity = new TypeEntity();
        typeEntity.setType("计算机网络");
        typeEntity.setComments("计算机网络知识点汇总");
        typeEntity.setId(1L);
        service.updateById(typeEntity);
        System.out.println("更新成功！");
    }

    @Test
    void testFindByIdTypeService() {
        TypeEntity type = service.getById(1);
        System.out.println(type);
    }


}
