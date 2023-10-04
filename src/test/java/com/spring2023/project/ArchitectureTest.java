package com.spring2023.project;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packagesOf = Application.class)
public class ArchitectureTest {
    @ArchTest
    public static final ArchRule Services_should_only_be_accessed_by_Controllers = classes()
            .that().resideInAPackage("..service..")
            .should().onlyBeAccessed().byAnyPackage("..controller..", "..service..");

    @ArchTest
    public static final ArchRule Repository_should_only_be_accessed_by_Services = classes()
            .that().resideInAPackage("..repository..")
            .should().onlyBeAccessed().byAnyPackage("..service..", "..repository..");

    @ArchTest
    public static final ArchRule Services_should_be_annotated_with_Service = classes()
            .that().resideInAPackage("..service..")
            .should().beAnnotatedWith(Service.class);


    @ArchTest
    public static final ArchRule Controllers_should_be_annotated_with_Controller = classes()
            .that().resideInAPackage("..controller..")
            .should().beAnnotatedWith(Controller.class);


}
