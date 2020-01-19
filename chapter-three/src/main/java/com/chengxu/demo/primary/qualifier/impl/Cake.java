package com.chengxu.demo.primary.qualifier.impl;

import com.chengxu.demo.primary.qualifier.Dessert;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cake implements Dessert {
}
