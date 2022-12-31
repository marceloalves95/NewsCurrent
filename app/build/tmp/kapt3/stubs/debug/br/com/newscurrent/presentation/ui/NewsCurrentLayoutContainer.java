package br.com.newscurrent.presentation.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lbr/com/newscurrent/presentation/ui/NewsCurrentLayoutContainer;", "", "binding", "Lbr/com/newscurrent/databinding/NewsCurrentMainBinding;", "viewModel", "Lbr/com/newscurrent/presentation/ui/NewsCurrentViewModel;", "(Lbr/com/newscurrent/databinding/NewsCurrentMainBinding;Lbr/com/newscurrent/presentation/ui/NewsCurrentViewModel;)V", "newsAdapter", "Lbr/com/newscurrent/presentation/adapter/NewsCurrentAdapter;", "handleErrorData", "", "error", "", "handleLoading", "state", "Lbr/com/newscurrent/presentation/model/NewsCurrentState;", "handleScreenData", "Landroidx/recyclerview/widget/RecyclerView;", "news", "Lbr/com/newscurrent/domain/models/News;", "setState", "app_debug"})
public final class NewsCurrentLayoutContainer {
    private final br.com.newscurrent.databinding.NewsCurrentMainBinding binding = null;
    private final br.com.newscurrent.presentation.ui.NewsCurrentViewModel viewModel = null;
    private br.com.newscurrent.presentation.adapter.NewsCurrentAdapter newsAdapter;
    
    public NewsCurrentLayoutContainer(@org.jetbrains.annotations.NotNull()
    br.com.newscurrent.databinding.NewsCurrentMainBinding binding, @org.jetbrains.annotations.NotNull()
    br.com.newscurrent.presentation.ui.NewsCurrentViewModel viewModel) {
        super();
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull()
    br.com.newscurrent.presentation.model.NewsCurrentState state) {
    }
    
    private final void handleLoading(br.com.newscurrent.presentation.model.NewsCurrentState state) {
    }
    
    private final androidx.recyclerview.widget.RecyclerView handleScreenData(br.com.newscurrent.domain.models.News news) {
        return null;
    }
    
    private final void handleErrorData(java.lang.Throwable error) {
    }
}