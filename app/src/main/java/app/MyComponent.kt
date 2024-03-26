package app

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [EntryPoint1Module::class, EntryPoint2Module::class, EntryPoint3Module::class])
interface MyComponent {
  fun getEntryPoint1(): EntryPoint1

  fun getEntryPoint2(): EntryPoint2

  fun getEntryPoint3(): EntryPoint3
}
