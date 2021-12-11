package com.max.tasks.task7;

import com.max.tasks.service.reader.impl.ReaderImpl;
import com.max.tasks.service.reader.Reader;
import com.max.tasks.service.writer.impl.WriterImpl;
import com.max.tasks.service.writer.Writer;

import java.util.Arrays;

public class Task7 {

    public static void main(String[] args) {
        Reader reader = ReaderImpl.getInstance();
        Writer writer = WriterImpl.getInstance();

        writer.writeLn("Input size of array: ");
        int arrSize = reader.readInt();
        int[] array = inputElementsOfArray(reader, writer, arrSize);

        shellSort(array);
        printSortedArr(writer, array);
    }


    private static int[] inputElementsOfArray(Reader reader, Writer writer, int arrSize) {
        int[] array = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            writer.writeLn("Input " + i + " element: ");
            array[i] = reader.readInt();
        }
        return array;
    }

    private static void shellSort(int[] array) {
        boolean isCorrect = false;
        while (!isCorrect) {
            isCorrect = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isCorrect = false;
                }
            }
        }
    }

    private static void printSortedArr(Writer writer, int[] array) {
        writer.writeLn(Arrays.toString(array));
    }

}