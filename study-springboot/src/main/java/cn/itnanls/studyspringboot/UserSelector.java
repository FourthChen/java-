package cn.itnanls.studyspringboot;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class UserSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"cn.itnanls.studyspringboot.entity.User","cn.itnanls.studyspringboot.entity.Cat","cn.itnanls.studyspringboot.entity.Vip"};
    }
}
