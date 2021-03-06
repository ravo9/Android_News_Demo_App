package newsdemoapp.injection

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import newsdemoapp.features.detailedview.DetailedViewViewModel
import newsdemoapp.features.feed.FeedViewModel

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(FeedViewModel::class)
    internal abstract fun bindFeedViewModel(feedViewModel: FeedViewModel)
            : ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(DetailedViewViewModel::class)
    internal abstract fun bindDetailedViewViewModel(detailedViewViewModel: DetailedViewViewModel)
            : ViewModel

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory)
            : ViewModelProvider.Factory
}