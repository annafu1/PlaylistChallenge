package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        Integer minPress = Integer.MAX_VALUE;
        Integer currentIndex = startIndex;
        for (int i = 0; i < playList.length; i++) {
            if(playList[(startIndex + i) % playList.length].equals(selection)) {
                minPress = i;
                System.out.println("Minimum Press: " + minPress);
                break;
            }
        }
        for (int i = 1; i < playList.length; i++) {
            currentIndex--;
            if (currentIndex < 0) {
                currentIndex = playList.length - 1;
            }
            if (playList[currentIndex].equals(selection)) {
                //below line allows us to find the smallest max val and i going up/down
                minPress = Math.min(minPress, i);
                System.out.println("Minimum Press: " + minPress);
                break;
            }
        }
        if (minPress.equals(Integer.MAX_VALUE)) {
            return null;
        }
        return minPress;
    }
}
