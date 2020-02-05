package com.vodafone.saafana.service.modelMapper;

import org.modelmapper.ModelMapper;

public class ModelMapperSingleton extends ModelMapper{
    private static ModelMapper instance = null;

    public static ModelMapper getInstance()
    {
        if(instance == null)
        {
            instance = new ModelMapper();
        }
        return instance;
    }

}
