package com.gh.study.factory;

import com.gh.study.model.UserModel;

import static com.gh.study.container.Container.userModelMap;

public class TestDataFactory {
    private int userLastNo;

    public int getUserLastNo() {
        return userLastNo;
    }

    public void makeTestUser() {
        for (int i = 1; i <= 9; i++) {
            UserModel userModel = new UserModel(++userLastNo, "testId" + i, "testPw" + i, "testNickname" + i);
            userModelMap.put(userLastNo, userModel);
        }
    }
}