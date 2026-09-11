package hw.exceptions;

public class UserService {
    /**У цьому завданні в тебе є клас UserService з методом getUserScore(). Цей метод приймає
     * 2 параметри:

     Records — це масив рядків, який представляє базу даних користувачів. Кожен рядок має 2
     параметри: email та userScore, та виглядає так: someEmail@gmail.com:userScore.
     * userScore має тип даних int і має значення в діапазоні 0 — Integer.MAX_VALUE.
     * email — це електронна адреса одного з рядків.
     Твоє завдання: з’ясуй, чи є користувач із вказаною email у масиві records:

     Якщо користувач існує, поверни його userScore у типі даних int;
     якщо користувач не існує, поверни UserNotFoundException з повідомленням

     Зверни увагу: тобі потрібно створити власне неперевірене (unchecked) виключення.

     Records = {"testEmail@gmail.com:100",
     "user@yahoo.com:1",
     "second-user@gmail.com:20",
     ...};
     email = testEmail@gmail.com;

     // 100;


     * records = {"testEmail@gmail.com:100"};
     * email = invalidEmail@gmail.com;
     *
     * // UserNotFoundException: User with given email doesn't exist

     * records = {"alice@mail.us:0"};
     * email = alice@mail.us:0_+;
     *
     * // UserNotFoundException: User with given email doesn't exist
     */

    public int getUserScore(String[] records, String email) {
        String userScore = null;

        for (String el : records){
            String[] fields = el.split(":");
            if (fields[0].equals(email)){
                userScore = fields[1];
            }
        }

        if(userScore != null){
            return Integer.parseInt(userScore);
        } else {
            throw new UserNotFoundException("User with given email doesn't exist");
        }
    }
}
