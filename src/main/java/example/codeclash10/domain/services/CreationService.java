package example.codeclash10.domain.services;

import java.io.File;

public class CreationService {

    public void upload(File zipFile){
        // goal: upzip the zip file and upload the unzip file on the file system

        // goal : get two different files from the file system
        // from the file system, I extract two different files

        // goal : create student code entity
        // from those two files, I create Student Codes
//        public void createStudentCode(File file1, File file2){
//            StudentCode studentCode1 = new StudentCode(file1);
//            StudentCode studentCode2 = new StudentCode(file2);
//        }

        // goal : create round entity
        // from those two student codes, I create a round containing those two files

        // goal : create game entity
        // from the round, I create a game that contains the round.

        // goal: create student entity
        // from the two files, I extract the studentId from the file name
        // from the two files, I extract the student name from the file name

        // goal: create codeRating entity
        // set the rating into 0;
        // set the game id from game entity (FK)
        // set the student id from student entity (FK)

        // set other attribute of entities with other instances
    }
}
