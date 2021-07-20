/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.util.List;
import lombok.Data;

/**
 *
 * @author Андрей
 */
@Data
public class Taco {

    private String name;
    private List<String> ingredients;
}
