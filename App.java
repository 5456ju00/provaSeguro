package com.seguro;

import java.sql.Connection;


import com.seguro.conexao.Conexao;
import com.seguro.dao.SeguroDao;
import com.seguro.modelo.Seguro;


public class App 
{
    public static void main( String[] args )
    {

        Seguro seguro = new Seguro("Top Star Seguro");

        SeguroDao SeguroDao = new SeguroDao();

    }


}

