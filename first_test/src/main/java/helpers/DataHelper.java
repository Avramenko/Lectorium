package helpers;

import io.qameta.allure.Step;
import managers.AppManager;
import org.openqa.selenium.WebElement;
import pages.PageManager;

import java.util.List;

public class DataHelper extends PageManager {
    int summ = 0;

    public DataHelper(){super(AppManager.getWebDriver());}

    @Step("Take amount of files and folders")
    public int amountOfAllFiles() {
        return repositoryPage.getAmountOfAllFileFromRepo();
    } //TODO Files +

    @Step("Take amount of files from repository")
    public int amountOfFiles(){
        return repositoryPage.getAmountOfFileFromRepo();
    }

    @Step("Take amount of folders from repository")
    public int  amountOfFolders(){
        return repositoryPage.getAmountOfFolderFromRepo();
    }

    @Step("Take star`s value from first Repo")
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
        return String.valueOf(summ);
    }

}
