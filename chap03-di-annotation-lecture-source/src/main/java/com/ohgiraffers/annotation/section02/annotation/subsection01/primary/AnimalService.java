package com.ohgiraffers.annotation.section02.annotation.subsection01.primary;

import com.ohgiraffers.annotation.section02.common.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("primaryService")
public class AnimalService {

    private final Animal animal;

    /*생성자가 한 개라면 @Autowired 어노테이션을 생략해도 알아서 의존성을 주입해준다.*/
    @Autowired
    public AnimalService(Animal animal){
        this.animal=animal;
    }

    public void animalEat(){
        animal.eat();
    }

}
