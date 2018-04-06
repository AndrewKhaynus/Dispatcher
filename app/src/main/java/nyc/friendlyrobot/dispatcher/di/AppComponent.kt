package nyc.friendlyrobot.dispatcher.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    @Component.Builder
    interface Builder {
        fun build(): AppComponent
        @BindsInstance
        fun application(application: Application): AppComponent.Builder
    }

    fun plusActivityComponent(activityModule: ActivityModule): ActivityComponent
}
