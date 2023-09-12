package tinkoff;
//  В одной компании решили создать свою модель машинного обучения. Обучение модели происходит на большом количестве наборов данных. \
//  Чтобы ускорить процесс было решено одновременно обучать модель на s серверах разной мощности с номерами от 1 до ﻿ s s﻿. 
//  Мощность сервера равна его номеру и определяет то, сколько наборов данных он обрабатывает за один раз.
//  Например, сервер с номером 1 имеет мощность 1 и обрабатывает 1 набор данных за единицу времени, а сервер с номером ﻿ s s﻿ обрабатывает ﻿ s s﻿ наборов данных. 
//  В силу устройства, ни один сервер не может за один раз обработать наборов меньше, чем его мощность. Сегодня сотрудникам необходимо обучить модель на ﻿ n n﻿ наборах данных. 
//  Было решено распределять данные между серверами циклически: начать с сервера с номером s, затем дать данные серверам с номерами ﻿

import java.util.Scanner;
public class tinkoff1 {
    public static Integer calcValue(Integer x, Integer y){
        for(int i = 1; i<= x; i++){
            y = y - i;
        }
        if(y==x){
            return 0;
        }
        else{
            return y;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Integer servers = in.nextInt();
        Integer amountData = in.nextInt();

        Integer value = calcValue(servers, amountData);
        System.out.println(value);
        

        in.close();


    }
}