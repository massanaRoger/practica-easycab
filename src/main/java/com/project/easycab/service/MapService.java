package com.project.easycab.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MapService {
    private static final String RESET = "\033[0m";
    private static final String RED = "\033[31m";
    private static final String GREEN = "\033[32m";
    private static final String YELLOW = "\033[33m";
    private static final String BLUE = "\033[34m";

    private char[][] mapa = new char[10][10];

    public MapService() {
        initMap();
    }

    private void initMap() {
        for (char[] chars : mapa) {
            Arrays.fill(chars, '.');
        }
        putTaxis();
        putObstacles();
        putDestination();
    }

    private void putTaxis() {
        mapa[2][3] = 'T';
        mapa[5][6] = 'T';
        mapa[7][2] = 'T';
    }

    private void putObstacles() {
        mapa[4][4] = 'X';
        mapa[4][5] = 'X';
    }

    private void putDestination() {
    }

    public String renderMap() {
        StringBuilder sb = new StringBuilder();

        for (char[] chars : mapa) {
            for (char celda : chars) {
                switch (celda) {
                    case 'T':
                        sb.append(GREEN).append(celda).append(RESET);
                        break;
                    case 'X':
                        sb.append(RED).append(celda).append(RESET);
                        break;
                    case 'D':
                        sb.append(BLUE).append(celda).append(RESET);
                        break;
                    default:
                        sb.append(YELLOW).append(celda).append(RESET);
                        break;
                }
                sb.append(' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
