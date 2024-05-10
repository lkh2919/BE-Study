package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

//interface 는 시그니처만 정의하는데 JPA 의 경우 인터페이스만 선언하고 나머지는 JPA가 알아서 한다
//extends 를 통해서 JPA CrudRepository 를 상속받아서 사용함
public interface ArticleRepository extends CrudRepository<Article, Long> {
// Article은 데이터베이스에 저장될 엔티티의 클래스
// Long은 이 엔티티의 ID 필드의 타입을 나타냅니다. 즉, Article 엔티티의 기본 키(key) 타입은 Long

    @Override
    ArrayList<Article> findAll();
}
