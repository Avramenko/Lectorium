package helpers;

import managers.AppManager;
import org.openqa.selenium.WebElement;
import pages.PageManager;

import java.util.List;

public class DataHelper extends PageManager {
    int summ = 0;

    public DataHelper(){super(AppManager.getWebDriver());}

    public int  amountOfAllFieles() {
        return repositoryPage.getAmountOfAllFileFromRepo();
    }

    public int  amountOfFieles(){
        return repositoryPage.getAmountOfFileFromRepo();
    }

    public int  amountOfFolders(){
        return repositoryPage.getAmountOfFolderFromRepo();
    }

    public String valueOfFirstStar(){
        List<WebElement> listOfAllStars = searchResultPage.checkValueFromStars();

        for (int i = 0; i < listOfAllStars.size(); i++ ){                     // Check what we take from Star  (Not import)
            System.out.println(listOfAllStars.get(i).getText());
        }

        for (int i = 0; i < listOfAllStars.size(); i++ ){                     // Check if star == exp. 20K
            String starsForOneRepo = listOfAllStars.get(i).getText();
            if (starsForOneRepo.contains("k") && starsForOneRepo.contains(".") == false){
                starsForOneRepo = starsForOneRepo.replace("k","");
                int newValueFromList = Integer.parseInt(starsForOneRepo);
                newValueFromList = newValueFromList * 1000;
                summ = summ + newValueFromList;
            }
            if (starsForOneRepo.contains(".")){                                // Check if star == exp. 34.231K
                starsForOneRepo = listOfAllStars.get(i).getText().replace("k","");
                starsForOneRepo = starsForOneRepo.replace(".","");
                int newValueFromList = Integer.parseInt(starsForOneRepo);
                newValueFromList = newValueFromList * 100;
                summ = summ + newValueFromList;
            } else{                                                            // In case if star == exp. 132
                int newValueFromList = Integer.parseInt(starsForOneRepo);
                summ = summ + newValueFromList;
            }
        }
        String summToString  = String.valueOf(summ);

        return summToString;
    }

}
