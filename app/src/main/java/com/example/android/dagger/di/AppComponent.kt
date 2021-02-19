package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.login.LoginComponent
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.registration.RegistrationComponent
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import com.example.android.dagger.settings.SettingsActivity
import com.example.android.dagger.user.UserComponent
import com.example.android.dagger.user.UserManager
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class, AppSubcomponents::class])
interface AppComponent{

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance context: Context): AppComponent
    }

    // Expose RegistrationComponent factory from the graph
    fun registrationComponent():RegistrationComponent.Factory

    fun loginComponent():LoginComponent.Factory

//    fun userComponent():UserComponent

    fun userManager():UserManager

//    fun inject(activity: RegistrationActivity)
//    fun inject(activity:MainActivity)
//    fun inject(fragment: EnterDetailsFragment)
//    fun inject(fragment: TermsAndConditionsFragment)

//    fun inject(activity: SettingsActivity)
}