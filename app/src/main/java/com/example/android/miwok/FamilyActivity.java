/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<FamilyMember> familyMembers = new ArrayList<FamilyMember>();

        familyMembers.add(new FamilyMember("father", "әpә", R.drawable.family_father));
        familyMembers.add(new FamilyMember("mother", "әṭa", R.drawable.family_mother));
        familyMembers.add(new FamilyMember("son", "angsi", R.drawable.family_son));
        familyMembers.add(new FamilyMember("daughter", "tune", R.drawable.family_daughter));
        familyMembers.add(new FamilyMember("older brother", "taachi", R.drawable.family_older_brother));
        familyMembers.add(new FamilyMember("younger brother", "chalitti", R.drawable.family_younger_brother));
        familyMembers.add(new FamilyMember("older sister", "teṭe", R.drawable.family_older_sister));
        familyMembers.add(new FamilyMember("younger sister", "kolliti", R.drawable.family_younger_sister));
        familyMembers.add(new FamilyMember("grandmother", "ama", R.drawable.family_grandmother));
        familyMembers.add(new FamilyMember("grandfather", "paapa", R.drawable.family_grandfather));


        FamilyMemberAdapter adapter = new FamilyMemberAdapter(this, familyMembers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
