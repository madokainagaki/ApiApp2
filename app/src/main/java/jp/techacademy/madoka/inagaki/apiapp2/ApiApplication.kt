package jp.techacademy.madoka.inagaki.apiapp2

import android.app.Application
import io.realm.Realm

class ApiApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
}