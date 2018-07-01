    package com.example.android.jamboafrica;

    import android.app.Activity;
    import android.content.Context;
    import android.content.Intent;
    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.view.Gravity;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import android.view.WindowManager;
    import android.widget.Button;
    import android.widget.CheckBox;
    import android.widget.CompoundButton;
    import android.widget.EditText;
    import android.widget.ImageView;
    import android.widget.LinearLayout;
    import android.widget.RadioGroup;
    import android.widget.Switch;
    import android.widget.TextView;
    import android.widget.Toast;

    public class QuizPage extends MainPage {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_quiz);
        }

        int totalScore = 0;

        int buttonClicks = 0;

        // Changing Question upon clicking next button

        public void nextQuestion(View view) {

            Button next = findViewById(R.id.next);


            // Setting Button Clicks to Zero as Initial Value

            next.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {

                    buttonClicks += 1;

                    // Changing Question Content Depending on Button Clicks

                    if (buttonClicks == 0) {

                        // Display New Question

                        String newQuestion = "Which is the Tallest Mountain in Africa?";
                        displayQuestion(newQuestion);

                        String option1 = "Mt. Speke";
                        String option2 = "Mt. Kenya";
                        String option3 = "Mt. Gesil";
                        String option4 = "Mt. Kilimanjaro";

                        // Display New Choices

                        CheckBox choiceGiven1 = findViewById(R.id.choice1);
                        choiceGiven1.setText(option1);

                        CheckBox choiceGiven2 = findViewById(R.id.choice2);
                        choiceGiven2.setText(option2);

                        CheckBox choiceGiven3 = findViewById(R.id.choice3);
                        choiceGiven3.setText(option3);

                        CheckBox choiceGiven4 = findViewById(R.id.choice4);
                        choiceGiven4.setText(option4);

                        // All Checkboxes Unchecked

                        choiceGiven1.setChecked(false);
                        choiceGiven2.setChecked(false);
                        choiceGiven3.setChecked(false);
                        choiceGiven4.setChecked(false);


                    } else if (buttonClicks == 1) {
                        // Display New Question

                        String newQuestion = "River Nile is the longest River in Africa. Can you guess how many countries it passes through?";
                        displayQuestion(newQuestion);

                        String option1 = "6";
                        String option2 = "11";
                        String option3 = "8";
                        String option4 = "13";

                        // Display New Choices

                        CheckBox choiceGiven1 = findViewById(R.id.choice1);
                        choiceGiven1.setText(option1);

                        CheckBox choiceGiven2 = findViewById(R.id.choice2);
                        choiceGiven2.setText(option2);

                        CheckBox choiceGiven3 = findViewById(R.id.choice3);
                        choiceGiven3.setText(option3);

                        CheckBox choiceGiven4 = findViewById(R.id.choice4);
                        choiceGiven4.setText(option4);

                        // All Checkboxes Unchecked

                        choiceGiven1.setChecked(false);
                        choiceGiven2.setChecked(false);
                        choiceGiven3.setChecked(false);
                        choiceGiven4.setChecked(false);


                    } else if (buttonClicks == 2) {
                        // Display New Question

                        String newQuestion = "What is the name of the Capital City of Nigeria?";
                        displayQuestion(newQuestion);

                        String option1 = "Abuja";
                        String option2 = "Lagos";
                        String option3 = "Kano";
                        String option4 = "Kinshasa";

                        // Display New Choices

                        CheckBox choiceGiven1 = findViewById(R.id.choice1);
                        choiceGiven1.setText(option1);

                        CheckBox choiceGiven2 = findViewById(R.id.choice2);
                        choiceGiven2.setText(option2);

                        CheckBox choiceGiven3 = findViewById(R.id.choice3);
                        choiceGiven3.setText(option3);

                        CheckBox choiceGiven4 = findViewById(R.id.choice4);
                        choiceGiven4.setText(option4);

                        // All Checkboxes Unchecked

                        choiceGiven1.setChecked(false);
                        choiceGiven2.setChecked(false);
                        choiceGiven3.setChecked(false);
                        choiceGiven4.setChecked(false);

                    } else if (buttonClicks == 3) {
                        String newQuestion = "Which country is in the Southern Region of Africa?";
                        displayQuestion(newQuestion);

                        String option1 = "Algeria";
                        String option2 = "Mali";
                        String option3 = "Angola";
                        String option4 = "Ethiopia";

                        // Display New Choices

                        CheckBox choiceGiven1 = findViewById(R.id.choice1);
                        choiceGiven1.setText(option1);

                        CheckBox choiceGiven2 = findViewById(R.id.choice2);
                        choiceGiven2.setText(option2);

                        CheckBox choiceGiven3 = findViewById(R.id.choice3);
                        choiceGiven3.setText(option3);

                        CheckBox choiceGiven4 = findViewById(R.id.choice4);
                        choiceGiven4.setText(option4);

                        // All Checkboxes Unchecked

                        choiceGiven1.setChecked(false);
                        choiceGiven2.setChecked(false);
                        choiceGiven3.setChecked(false);
                        choiceGiven4.setChecked(false);

                    } else if (buttonClicks == 4) {

                        String newQuestion = "Africa has the Largest forest in the World.";
                        displayQuestion(newQuestion);

                        String option1 = "true";
                        String option2 = "false";

                        // Display New Choices

                        CheckBox choiceGiven1 = findViewById(R.id.choice1);
                        choiceGiven1.setText(option1);

                        CheckBox choiceGiven2 = findViewById(R.id.choice2);
                        choiceGiven2.setText(option2);

                        CheckBox choiceGiven3 = findViewById(R.id.choice3);
                        choiceGiven3.setVisibility(view.INVISIBLE);

                        CheckBox choiceGiven4 = findViewById(R.id.choice4);
                        choiceGiven4.setVisibility(view.INVISIBLE);

                        // All Checkboxes Unchecked

                        choiceGiven1.setChecked(false);
                        choiceGiven2.setChecked(false);
                        choiceGiven3.setChecked(false);
                        choiceGiven4.setChecked(false);

                    } else if (buttonClicks == 5) {

                        // Display New Question


                        String newQuestion = "Amazing! You have done well to complete the Challenge. Check Your Progress on the Progress Page" ;
                        displayQuestion(newQuestion);
    
                        // Display New Choices

                        CheckBox choiceGiven1 = findViewById(R.id.choice1);
                        choiceGiven1.setVisibility(view.INVISIBLE);

                        CheckBox choiceGiven2 = findViewById(R.id.choice2);
                        choiceGiven2.setVisibility(view.INVISIBLE);

                        CheckBox choiceGiven3 = findViewById(R.id.choice3);
                        choiceGiven3.setVisibility(view.INVISIBLE);

                        CheckBox choiceGiven4 = findViewById(R.id.choice4);
                        choiceGiven4.setVisibility(View.INVISIBLE);

                        ImageView exitQuiz = findViewById(R.id.ext);
                        exitQuiz.setVisibility(view.VISIBLE);

                        ImageView submission = findViewById(R.id.submit);
                        submission.setVisibility(view.GONE);

                        Button proceed = findViewById(R.id.next);
                        proceed.setVisibility(view.GONE);

                        ImageView qImage= findViewById(R.id.quiz_image);
                            qImage.setVisibility(view.GONE);

                        // All Checkboxes Unchecked

                        choiceGiven1.setChecked(false);
                        choiceGiven2.setChecked(false);
                        choiceGiven3.setChecked(false);
                        choiceGiven4.setChecked(false);

                    }
                }
            });

        }

        ;


        //  Edit Text Method

        private void editTextField(View view) {
            EditText answerField = new EditText(this);
            answerField.getText();
        }


        // Adding an Edit Text

        public void createField(View view) {
            LinearLayout quizOptions = (LinearLayout) findViewById(R.id.quiz_choices);
            EditText answerField = new EditText(this);
            answerField.getText();
        }

        // Questions Method

        private void displayQuestion(String question) {
            TextView questionAsked = findViewById(R.id.q);
            questionAsked.setText(question);
        }

        // Quit Quiz

        public void exitToMain(View view) {

            // Changing Activity

            ImageView exitQuiz = findViewById(R.id.ext);

            exitQuiz.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent exit = new Intent(getApplicationContext(), MainPage.class);
                    startActivity(exit);
                }
            });

        }

        // Limiting Number of Options Selected

        public void limitSelect(View view) {
            CheckBox option1 = findViewById(R.id.choice1);
            CheckBox option2 = findViewById(R.id.choice2);
            CheckBox option3 = findViewById(R.id.choice3);
            CheckBox option4 = findViewById(R.id.choice4);

            Boolean trueA = option1.isChecked();
            Boolean trueB = option2.isChecked();
            Boolean trueC = option3.isChecked();
            Boolean trueD = option4.isChecked();

            Boolean[] limitSelection = {trueA, trueB, trueC, trueD};

            int numberOfChoices = limitSelection.length;

            if (numberOfChoices > 1) {

                switch (view.getId()) {
                    case R.id.choice1:
                        if (trueA) {
                            option2.setChecked(false);
                            option3.setChecked(false);
                            option4.setChecked(false);
                        }
                        break;
                    case R.id.choice2:
                        if (trueB) {
                            option1.setChecked(false);
                            option3.setChecked(false);
                            option4.setChecked(false);
                        }
                        break;
                    case R.id.choice3:
                        if (trueC) {
                            option1.setChecked(false);
                            option2.setChecked(false);
                            option4.setChecked(false);
                        }
                        break;
                    case R.id.choice4:
                        if (trueD) {
                            option1.setChecked(false);
                            option2.setChecked(false);
                            option3.setChecked(false);
                        }
                }
            }
        }

        /*
         *  Calculating Total Score Method
         * */

        public int scoreTotal(View view) {

            Button nextItem = findViewById(R.id.next);
            nextItem.setVisibility(view.VISIBLE);

            int score1 = calculateQuestion1();
            int score2 = calculateQuestion2();
            int score3 = calculateQuestion3();
            int score4 = calculateQuestion4();

            int percentage = ((score1 + score2 + score3 + score4)/4)*100;

            return percentage;

        }


        private int calculateQuestion1(){
            int score = 0;
            CheckBox option1 = findViewById(R.id.choice1);
            CheckBox option2 = findViewById(R.id.choice2);
            CheckBox option3 = findViewById(R.id.choice3);
            CheckBox option4 = findViewById(R.id.choice4);

            if (option2.isChecked()) {
                score += 1;

            } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                score += 0;

            }

            return score;
        }

        private int calculateQuestion2(){
            int score = 0;
            CheckBox option1 = findViewById(R.id.choice1);
            CheckBox option2 = findViewById(R.id.choice2);
            CheckBox option3 = findViewById(R.id.choice3);
            CheckBox option4 = findViewById(R.id.choice4);
            if (option4.isChecked()) {
                totalScore += 1;

            } else if (option1.isChecked() || option2.isChecked() || option3.isChecked()) {
                totalScore += 0;
            }

            return score;
        }

        private int calculateQuestion3(){
            int score = 0;
            CheckBox option1 = findViewById(R.id.choice1);
            CheckBox option2 = findViewById(R.id.choice2);
            CheckBox option3 = findViewById(R.id.choice3);
            CheckBox option4 = findViewById(R.id.choice4);
            if (option2.isChecked()) {
                totalScore += 1;

            } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                totalScore += 0;

            }
            return score;
        }

        private int calculateQuestion4(){
            int score = 0;
            CheckBox option1 = findViewById(R.id.choice1);
            CheckBox option2 = findViewById(R.id.choice2);
            CheckBox option3 = findViewById(R.id.choice3);
            CheckBox option4 = findViewById(R.id.choice4);
            if (option1.isChecked()) {
                totalScore += 1;

            } else if (option2.isChecked() || option3.isChecked() || option4.isChecked()) {
                totalScore += 0;
            }
            return score;
        }

        private int calculateQuestion5(){
            int score = 0;
            CheckBox option1 = findViewById(R.id.choice1);
            CheckBox option2 = findViewById(R.id.choice2);
            CheckBox option3 = findViewById(R.id.choice3);
            CheckBox option4 = findViewById(R.id.choice4);
            if (option2.isChecked()) {
                totalScore += 1;

            } else if (option1.isChecked()) {
                totalScore += 0;
            }
            return score;
        }


    }
