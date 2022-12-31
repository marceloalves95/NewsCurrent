package br.com.newscurrent.presentation.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lbr/com/newscurrent/presentation/ui/NewsCurrentViewModel;", "Landroidx/lifecycle/ViewModel;", "getNewsCurrentInteractor", "Lbr/com/newscurrent/domain/interactor/GetNewsCurrentInteractor;", "(Lbr/com/newscurrent/domain/interactor/GetNewsCurrentInteractor;)V", "_state", "Landroidx/lifecycle/MutableLiveData;", "Lbr/com/newscurrent/presentation/model/NewsCurrentState;", "state", "Landroidx/lifecycle/LiveData;", "getState", "()Landroidx/lifecycle/LiveData;", "loadNewsCurrent", "", "app_debug"})
public final class NewsCurrentViewModel extends androidx.lifecycle.ViewModel {
    private final br.com.newscurrent.domain.interactor.GetNewsCurrentInteractor getNewsCurrentInteractor = null;
    private final androidx.lifecycle.MutableLiveData<br.com.newscurrent.presentation.model.NewsCurrentState> _state = null;
    
    public NewsCurrentViewModel(@org.jetbrains.annotations.NotNull()
    br.com.newscurrent.domain.interactor.GetNewsCurrentInteractor getNewsCurrentInteractor) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<br.com.newscurrent.presentation.model.NewsCurrentState> getState() {
        return null;
    }
    
    public final void loadNewsCurrent() {
    }
}