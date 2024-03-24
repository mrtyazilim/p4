package VarliksalSiniflar;

//import Veri.Dataable;


import Veri.DOMAIN_CONSTANT;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 @author Murat Değirmenci,UPoDer
 
 */

/*
1.get , set, üye değişken tanımlamaları için ide destekleri öğrenilmeli
git git hub öğrenilmeli

*/
//Dataable
public class User   {
    public String username,password,name,surname;
    //public char[] tckn= {'1','1','2','2','3','4','4','5','5','5','5'};
    public char[] tckn=new char[11];
    // burası belki de string olmalı
    //tarih saat ekle
    //zorunlu alanarı nasıl yapmalıyım
    long balance;//bakiye

    enum gender {        Kadin,        Erkek    };







}
