package com.example.roomlocaldb

import android.app.Application
import com.example.roomlocaldb.dependenciesinjection.ContainerApp
import com.example.roomlocaldb.dependenciesinjection.InterfaceContainerApp

class KrsApp: Application () {
    //Untuk menyimpan instance ContainerApp
    lateinit var containerApp: ContainerApp

    override fun onCreate() {
        super.onCreate()
        //Membuat instance ContainerApp
        containerApp = ContainerApp(this)
        //instance adalah object yang dibuat dari class
    }
}