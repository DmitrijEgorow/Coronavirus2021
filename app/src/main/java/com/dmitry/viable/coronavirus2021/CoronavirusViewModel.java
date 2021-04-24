package com.dmitry.viable.coronavirus2021;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CoronavirusViewModel extends ViewModel {
    MutableLiveData<String> liveData = new MutableLiveData<>();

    public LiveData<String> getLiveData() {
        return liveData;
    }

    public void setLiveData(String value) {
        liveData.setValue(value);
    }
}
