package com.example.kebudayaan_mpti_pab;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.kebudayaan_mpti_pab.QuizContract.*;

import java.util.ArrayList;
import java.util.List;

public class QuizDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "MyAwesomeQuiz.db";
    private static final int DATABASE_VERSION = 1;
    private SQLiteDatabase db;
    public QuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;
        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionsTable.TABLE_NAME + " ( " +
                QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionsTable.COLUMN_ANSWER_NR + " INTEGER , " +
                QuestionsTable.COLUMN_CATEGORY + " TEXT " +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);


        String sql = "CREATE TABLE students " +
                "( id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "name TEXT, " +
                "kategori TEXT, " +
                "nilai TEXT ) ";
        db.execSQL(sql);


        fillQuestionsTable();
    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + QuestionsTable.TABLE_NAME );
        String sql = "DROP TABLE IF EXISTS students";
        db.execSQL(sql);
        onCreate(db);
    }
    private void fillQuestionsTable() {
        Question q1 = new Question("Tari Saman merupakan tarian yang berasal dari...",
                "Aceh", "Jawa Barat", "Yogyakarta", 1, Question.CATEGORY_TARIAN);
        addQuestion(q1);
        Question q2 = new Question("Salah satu tarian yang berasal dari Bali adalah tari...",
                "Jaipong", "Reog", "Kecak", 3, Question.CATEGORY_TARIAN);
        addQuestion(q2);
        Question q3 = new Question("Jawa Timur tekenal akan keseniannya yang berupa tari...",
                "Jaipong", "Reog", "Kecak", 2, Question.CATEGORY_TARIAN);
        addQuestion(q3);
        Question q4 = new Question("Tari Serimpi merupakan tarian yang berasal dari...",
                "Aceh", "Jawa Barat", "Yogyakarta", 3, Question.CATEGORY_TARIAN);
        addQuestion(q4);
        Question q5 = new Question("Jawa Barat memiliki tarian yang terkenal hingga mancanegara, tarian itu adalah tari.....",
                "Jaipong", "Reog", "Kecak", 1, Question.CATEGORY_TARIAN);
        addQuestion(q5);
        Question q6 = new Question("Rumah adat Papua disebut dengan...",
                "Lamin", "Panjang", "Honai", 3, Question.CATEGORY_RUMAH);
        addQuestion(q6);
        Question q7 = new Question("Rumah adat yang berasal dari Kalimantan Timur adalah...",
                "Lamin", "Panjang", "Honai", 1, Question.CATEGORY_RUMAH);
        addQuestion(q7);
        Question q8 = new Question("Bolon merupakan rumah adat yang beraada di... ",
                "Jawa Tengah", "Sumatera Utara", "Sumatera Selatan", 2, Question.CATEGORY_RUMAH);
        addQuestion(q8);
        Question q9 = new Question("Rumah adat Limas berasal dari...",
                "Jawa Tengah", "Sumatera Utara", "Sumatera Selatan", 3, Question.CATEGORY_RUMAH);
        addQuestion(q9);
        Question q10 = new Question("Joglo Sinom merupakan rumah adat yang berasal dari... ",
                "Jawa Tengah", "Sumatera Utara", "Sumatera Selatan", 1, Question.CATEGORY_RUMAH);
        addQuestion(q10);
        Question q11 = new Question("Pakaian adat Sumatera Barat adalah...",
                "Payas Jangkep", "Bundo Kanduang", "Lurik & Surjan", 2, Question.CATEGORY_BAJU);
        addQuestion(q11);
        Question q12 = new Question("Pakaian adat yang berasal dari Yogyakarta...",
                "Payas Jangkep", "Bundo Kanduang", "Lurik & Surjan", 3, Question.CATEGORY_BAJU);
        addQuestion(q12);
        Question q13 = new Question("Baju Bodo merupakan pakaian adat yang berasal dari... ",
                "Sulawesi Selatan", "Maluku", "Bali", 1, Question.CATEGORY_BAJU);
        addQuestion(q13);
        Question q14 = new Question("Pakaian Cele merupakan pakaian yang berasal dari... ",
                "Sulawesi Selatan", "Maluku", "Bali", 2, Question.CATEGORY_BAJU);
        addQuestion(q14);
        Question q15 = new Question("Payas Pangkep merupakan baju adat asal... ",
                "Sulawesi Selatan", "Maluku", "Bali", 3, Question.CATEGORY_BAJU);
        addQuestion(q15);
        Question q16 = new Question("Mandau merupakan senjata yang berasal dari... ",
                "Kalimantan Tengah", "Jawa Timur", "Aceh", 1, Question.CATEGORY_SENJATA);
        addQuestion(q16);
        Question q17 = new Question("Clurit merupakan senjata yang berasal dari...",
                "Kalimantan Selatan", "Jawa Timur", "Aceh", 2, Question.CATEGORY_SENJATA);
        addQuestion(q17);
        Question q18 = new Question("Rencong merupakan senjata khas...",
                "Kalimantan Selatan", "Jawa Timur", "Aceh", 3, Question.CATEGORY_SENJATA);
        addQuestion(q18);
        Question q19 = new Question("Senjata yang berasal dari jawa barat adalah...",
                "Kujang", "Kalawai", "Rencong", 1, Question.CATEGORY_SENJATA);
        addQuestion(q19);
        Question q20 = new Question("Senjata yang berasal dari papua adalah...",
                "Kujang", "Kalawai", "Rencong", 2, Question.CATEGORY_SENJATA);
        addQuestion(q20);
        Question q21 = new Question("Jawa Barat memiliki tarian yang terkenal hingga mancanegara, tarian itu adalah tari.....",
                "Jaipong", "Reog", "Kecak", 1, Question.CATEGORY_MIX);
        addQuestion(q21);
        Question q22 = new Question("Rumah adat Papua disebut dengan...",
                "Lanin", "Panjang", "Honai", 3, Question.CATEGORY_MIX);
        addQuestion(q22);
        Question q23 = new Question("Pakaian cele merupakan pakaian yang berasal dari... ",
                "Sulawesi Selatan", "Maluku", "Bali", 2, Question.CATEGORY_MIX);
        addQuestion(q23);
        Question q24 = new Question("Payas pangkep merupakan baju adat asal... ",
                "Sulawesi Selatan", "Maluku", "Bali", 3, Question.CATEGORY_MIX);
        addQuestion(q24);
        Question q25 = new Question("Mandau merupakan senjata yang berasal dari... ",
                "Kalimantan Tengah", "Jawa Timur", "Aceh", 1, Question.CATEGORY_MIX);
        addQuestion(q25);

        Question q26 = new Question("Tarian adat khas riau adalah...",
                "Tari Zaping", "Tari Lego-lego", "Tari Mance", 1, Question.CATEGORY_TARIAN);
        addQuestion(q26);
        Question q27 = new Question("Tarian adat khas NTT adalah..",
                "Tari Zaping", "Tari Lego-lego", "Tari Mance", 2, Question.CATEGORY_TARIAN);
        addQuestion(q27);
        Question q28 = new Question("Tarian adat khas Kalimantan utara adalah...",
                "Tari Zaping", "Tari Lego-lego", "Tari Mance", 3, Question.CATEGORY_TARIAN);
        addQuestion(q28);
        Question q29 = new Question("Tari Dero merupakan tarian adat yang berasal dari...",
                "Sulawesi Tengah", "Bengkulu", "Papua Barat", 3, Question.CATEGORY_TARIAN);
        addQuestion(q29);
        Question q30 = new Question("Tari Sajojo merupakan tarian adat yang berasal dari...",
                "Sulawesi Tengah", "Bengkulu", "Papua Barat", 1, Question.CATEGORY_TARIAN);
        addQuestion(q30);

        Question q31 = new Question("Rumah Tambi merupakan rumah adat yang berasal dari...",
                "NTB", "Kalimantan Tengah", "Sulawesi Tenggara", 3, Question.CATEGORY_RUMAH);
        addQuestion(q31);
        Question q35 = new Question("Rumah Betang merupakan rumah adat yang berasal dari...",
                "NTB", "Kalimantan Tengah", "Sulawesi Tenggara", 2, Question.CATEGORY_RUMAH);
        addQuestion(q35);
        Question q32 = new Question("Rumah Bale Lumbung merupakan rumah adat yang berasal dari... ",
                "NTB", "Kalimantan Tengah", "Sulawesi Tenggara", 1, Question.CATEGORY_RUMAH);
        addQuestion(q32);
        Question q33 = new Question("Rumah adat asal banten disebut juga dengan... ",
                "Sulah Nyanda", "Panjang", "Honai", 1, Question.CATEGORY_RUMAH);
        addQuestion(q33);
        Question q34 = new Question("Rumah adat asal Bangka Belitung disebut juga dengan... ",
                "Lanin", "Panjang", "Rakit Limas", 3, Question.CATEGORY_RUMAH);
        addQuestion(q34);

        Question q36 = new Question("Pakaian adat khas Jambi disebut dengan... ",
                "Baju Tulang Bawang", "Baju Ngeembe", "Baju Kurung Tanggung", 3, Question.CATEGORY_BAJU);
        addQuestion(q36);
        Question q37 = new Question("Pakaian adat khas Lampung disebut dengan...  ",
                "Baju Tulang Bawang", "Baju Ngeembe", "Baju Kurung Tanggung", 1, Question.CATEGORY_BAJU);
        addQuestion(q37);
        Question q38 = new Question("Pakaian adat khas Sulawesi Tengah disebut dengan...  ",
                "Baju Tulang Bawang", "Baju Ngeembe", "Baju Kurung Tanggung", 2, Question.CATEGORY_BAJU);
        addQuestion(q38);
        Question q39 = new Question("Manteren Lamo merupakan baju adat khas... ",
                "Sulawesi Selatan", "Maluku", "Maluku Utara", 3, Question.CATEGORY_BAJU);
        addQuestion(q39);
        Question q40 = new Question("Babu Nggawi Langai merupakan baju adat khas... ",
                "Sulawesi Selatan", "Sulawesi Tenggara", "Bali", 2, Question.CATEGORY_BAJU);
        addQuestion(q40);

        Question q41 = new Question("Badik Lampung merupakan senjata khas...",
                "Lampung", "Jawa Tengah", "Gorontalo", 1, Question.CATEGORY_SENJATA);
        addQuestion(q41);
        Question q42 = new Question("Keris merupakan senjata khas... ",
                "Lampung", "Jawa Tengah", "Gorontalo", 2, Question.CATEGORY_SENJATA);
        addQuestion(q42);
        Question q43 = new Question("Wamilo merupakan senjata khas...",
                "Lampung", "Jawa Tengah", "Gorontalo", 3, Question.CATEGORY_SENJATA);
        addQuestion(q43);
        Question q44 = new Question("Senjata yang berasal dari Bali adalah...",
                "Keris", "Kandik", "Tulup", 2, Question.CATEGORY_SENJATA);
        addQuestion(q44);
        Question q45 = new Question("Senjata yang berasal dari NTB adalah...",
                "Keris", "Kandik", "Tulup", 3, Question.CATEGORY_SENJATA);
        addQuestion(q45);



        Question q46 = new Question("Wamilo merupakan senjata khas...",
                "Lampung", "Jawa Tengah", "Gorontalo", 3, Question.CATEGORY_MIX);
        addQuestion(q46);

        Question q47 = new Question("Manteren Lamo merupakan baju adat khas... ",
                "Sulawesi Selatan", "Maluku", "Maluku Utara", 3, Question.CATEGORY_MIX);
        addQuestion(q47);

        Question q48 = new Question("Tari Sajojo merupakan tarian adat yang berasal dari...",
                "Sulawesi Tengah", "Bengkulu", "Papua Barat", 1, Question.CATEGORY_MIX);
        addQuestion(q48);
        Question q49 = new Question("Rumah Bale Lumbung merupakan rumah adat yang berasal dari... ",
                "NTB", "Kalimantan Tengah", "Sulawesi Tenggara", 1, Question.CATEGORY_MIX);
        addQuestion(q49);
        Question q50 = new Question("Senjata yang berasal dari NTB adalah...",
                "Keris", "Kandik", "Tulup", 3, Question.CATEGORY_MIX);
        addQuestion(q50);


    }
    private void addQuestion(Question question) {
        ContentValues cv = new ContentValues();
        cv.put(QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuestionsTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuestionsTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuestionsTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        cv.put(QuestionsTable.COLUMN_CATEGORY, question.getCategory());
        db.insert(QuestionsTable.TABLE_NAME, null, cv);
    }

    public ArrayList<Question> getAllQuestions() {
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME, null );

        if (c.moveToFirst()){
            do{
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER_NR)));
                questionList.add(question);
            }while (c.moveToNext());
        }

        c.close();
        return  questionList;
    }
    public ArrayList<Question> getQuestions(String category) {
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        String[] selectionArgs = new String[]{category};
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME +
                " WHERE " + QuestionsTable.COLUMN_CATEGORY + " = ?", selectionArgs);
        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER_NR)));
                question.setCategory(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_CATEGORY)));
                questionList.add(question);
            } while (c.moveToNext());
        }
        c.close();
        return questionList;
    }
}
