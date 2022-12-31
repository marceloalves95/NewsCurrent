package br.com.newscurrent.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lbr/com/newscurrent/data/api/NewsApi;", "", "getNews", "Lretrofit2/Response;", "Lbr/com/newscurrent/data/models/NewsResponse;", "category", "", "apiKey", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface NewsApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "top-headlines?country=br")
    public abstract java.lang.Object getNews(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "category")
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "apiKey")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<br.com.newscurrent.data.models.NewsResponse>> continuation);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
    }
}