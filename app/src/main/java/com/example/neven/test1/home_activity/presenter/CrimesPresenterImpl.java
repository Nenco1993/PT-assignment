package com.example.neven.test1.home_activity.presenter;

import com.example.neven.test1.base.base_presenter.BasePresenterImpl;
import com.example.neven.test1.home_activity.HomeContract;
import com.example.neven.test1.home_activity.models.PagerStuff;
import com.example.neven.test1.model.interactors.interactorsDafaq.crime_interactors.CrimesInteractor;
import com.example.neven.test1.model.interactors.interactorsDafaq.listener.CrimesListener;
import com.example.neven.test1.model.data_models.Crimes;

import java.util.*;

import javax.inject.Inject;

/**
 * Created by Neven on 4.9.2017..
 */

public class CrimesPresenterImpl implements BasePresenterImpl, HomeContract.Presenter, CrimesListener {

    private final CrimesInteractor interactor;
    private final HomeContract.View view;
    private PagerStuff pagerStuff;

    @Inject
    public CrimesPresenterImpl(CrimesInteractor interactor, HomeContract.View view, PagerStuff pagerStuff) {
        this.interactor = interactor;
        this.view = view;
        this.pagerStuff = pagerStuff;
    }

    @Override
    public void onStart() {
        interactor.downloadCrimes(this);
    }

    @Override
    public void onStop() {
        interactor.dispose();
    }

    @Override
    public void onFailure() {
        view.showErrorMessage();
    }

    @Override
    public void onSuccess(List<Crimes> listCrimes) {
        view.showMyData(assignData(listCrimes));
    }

    // gets all the first letters from the list, sorts them ascending and it gets rid of duplicates
    private ArrayList<String> getFirstLetters(List<Crimes> listCrimes) {
        HashSet<String> hashSet = new HashSet<>();
        for (Crimes singleCrime : listCrimes) {
            String firstLetter = String.valueOf(singleCrime.category.charAt(0));
            hashSet.add(firstLetter);
        }
        ArrayList<String> sortedList = new ArrayList<>(hashSet);
        Collections.sort(sortedList);

        return sortedList;
    }

    // assigns the corresponding list to the matched letter
    private List<PagerStuff> assignData(List<Crimes> listCrimes) {
        ArrayList<String> firstLettersSorted = getFirstLetters(listCrimes);
        List<PagerStuff> listPagerStuff = new ArrayList<>();

        for (String singleSortedLetter : firstLettersSorted) {

            pagerStuff = new PagerStuff();
            pagerStuff.title = singleSortedLetter;
            for (Crimes singleCrime : listCrimes) {
                if (singleSortedLetter.equalsIgnoreCase(String.valueOf(singleCrime.category.charAt(0)))) {
                    pagerStuff.listItems.add(singleCrime.category);
                }
            }
            listPagerStuff.add(pagerStuff);
        }

        return listPagerStuff;


    }


}
