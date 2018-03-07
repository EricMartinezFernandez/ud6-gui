package Tres_en_raya;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class Tablero {
    private JPanel Tablero;
    private JButton boton00;
    private JButton boton01;
    private JButton boton02;
    private JButton boton10;
    private JButton boton11;
    private JButton boton12;
    private JButton boton20;
    private JButton boton21;
    private JButton boton22;
    private JLabel huecoJugador;
    private JLabel huecoTurno;
    private JLabel huecoInfo;

    private int turno = 1;
    private String turnoTexto;
    int turnoReal;

    int tres = 3;

    int[][] tablero = {{3, 3, 3},
            {3, 3, 3},
            {3, 3, 3}};


    private void establecerNumero(int a, int b, int turno) {
        tablero[a][b] = turno;
    }

    private static boolean hayGanador(int[][] t, int turno) {

        boolean hayGanador = false;

        // Filas
        if (t[0][0] == turno && t[0][1] == turno && t[0][2] == turno) {
            hayGanador = true;
        }
        if (t[1][0] == turno && t[1][1] == turno && t[1][2] == turno) {
            hayGanador = true;
        }
        if (t[2][0] == turno && t[2][1] == turno && t[2][2] == turno) {
            hayGanador = true;
        }

        // Columnas
        if (t[0][0] == turno && t[1][0] == turno && t[2][0] == turno) {
            hayGanador = true;
        }
        if (t[0][1] == turno && t[1][1] == turno && t[2][1] == turno) {
            hayGanador = true;
        }
        if (t[0][2] == turno && t[1][2] == turno && t[2][2] == turno) {
            hayGanador = true;
        }

        // Diagonales
        if (t[0][0] == turno && t[1][1] == turno && t[2][2] == turno) {
            hayGanador = true;
        }
        if (t[0][2] == turno && t[1][1] == turno && t[2][0] == turno) {
            hayGanador = true;
        }

        return hayGanador;
    }


    private boolean casillaOcupada(int a, int b) {
        boolean libre = true;
        if (tablero[a][b] == 3) {
            libre = true;
        } else {
            libre = false;
        }
        return libre;
    }

    public Tablero() {
        boton00.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (casillaOcupada(0, 0)) {
                    turno++;
                    turnoTexto = String.valueOf(turno);
                    huecoTurno.setText(turnoTexto);
                    if (turno % 2 == 0) {
                        huecoJugador.setText("Jugador 2");
                        turnoReal = 1;
                    } else {
                        huecoJugador.setText("Jugador 1");
                        turnoReal = 2;
                    }
                    establecerNumero(0, 0, turnoReal);
                    if (hayGanador(tablero, turnoReal)) {
                        huecoInfo.setText("Hay ganador");
                    }

                    if (turnoReal == 1) {
                        boton00.setText("X");
                    } else {
                        boton00.setText("O");
                    }
                } else {
                    huecoInfo.setText("Casilla Ocupada");
                }


            }
        });
        boton01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (casillaOcupada(0, 1)) {
                    turno++;
                    turnoTexto = String.valueOf(turno);
                    huecoTurno.setText(turnoTexto);
                    if (turno % 2 == 0) {
                        huecoJugador.setText("Jugador 2");
                        turnoReal = 1;
                    } else {
                        huecoJugador.setText("Jugador 1");
                        turnoReal = 2;
                    }
                    establecerNumero(0, 1, turnoReal);
                    if (hayGanador(tablero, turnoReal)) {
                        huecoInfo.setText("Hay ganador");
                    }
                    ;
                    if (turnoReal == 1) {
                        boton01.setText("X");
                    } else {
                        boton01.setText("O");
                    }
                    ;
                } else {
                    huecoInfo.setText("Casilla Ocupada");
                }

            }
        });
        boton02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (casillaOcupada(0, 2)) {
                    turno++;
                    turnoTexto = String.valueOf(turno);
                    huecoTurno.setText(turnoTexto);
                    if (turno % 2 == 0) {
                        huecoJugador.setText("Jugador 2");
                        turnoReal = 1;
                    } else {
                        huecoJugador.setText("Jugador 1");
                        turnoReal = 2;
                    }
                    establecerNumero(0, 2, turnoReal);
                    if (hayGanador(tablero, turnoReal)) {
                        huecoInfo.setText("Hay ganador");
                    }
                    ;
                    if (turnoReal == 1) {
                        boton02.setText("X");
                    } else {
                        boton02.setText("O");
                    }
                } else {
                    huecoInfo.setText("Casilla Ocupada");
                }

            }
        });
        boton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (casillaOcupada(1, 0)) {
                    turno++;
                    turnoTexto = String.valueOf(turno);
                    huecoTurno.setText(turnoTexto);
                    if (turno % 2 == 0) {
                        huecoJugador.setText("Jugador 2");
                        turnoReal = 1;
                    } else {
                        huecoJugador.setText("Jugador 1");
                        turnoReal = 2;
                    }
                    establecerNumero(1, 0, turnoReal);
                    if (hayGanador(tablero, turnoReal)) {
                        huecoInfo.setText("Hay ganador");
                    }
                    ;
                    if (turnoReal == 1) {
                        boton10.setText("X");
                    } else {
                        boton10.setText("O");
                    }
                } else {
                    huecoInfo.setText("Casilla Ocupada");
                }

            }
        });
        boton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (casillaOcupada(1, 1)) {
                    turno++;
                    turnoTexto = String.valueOf(turno);
                    huecoTurno.setText(turnoTexto);
                    if (turno % 2 == 0) {
                        huecoJugador.setText("Jugador 2");
                        turnoReal = 1;
                    } else {
                        huecoJugador.setText("Jugador 1");
                        turnoReal = 2;
                    }
                    establecerNumero(1, 1, turnoReal);
                    if (hayGanador(tablero, turnoReal)) {
                        huecoInfo.setText("Hay ganador");
                    }
                    ;
                    if (turnoReal == 1) {
                        boton11.setText("X");
                    } else {
                        boton11.setText("O");
                    }
                } else {
                    huecoInfo.setText("Casilla Ocupada");
                }

            }
        });
        boton12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (casillaOcupada(1, 2)) {
                    turno++;
                    turnoTexto = String.valueOf(turno);
                    huecoTurno.setText(turnoTexto);
                    if (turno % 2 == 0) {
                        huecoJugador.setText("Jugador 2");
                        turnoReal = 1;
                    } else {
                        huecoJugador.setText("Jugador 1");
                        turnoReal = 2;
                    }
                    establecerNumero(1, 2, turnoReal);
                    if (hayGanador(tablero, turnoReal)) {
                        huecoInfo.setText("Hay ganador");
                    }
                    ;
                    if (turnoReal == 1) {
                        boton12.setText("X");
                    } else {
                        boton12.setText("O");
                    }
                } else {
                    huecoInfo.setText("Casilla Ocupada");
                }

            }
        });
        boton20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (casillaOcupada(2, 0)) {
                    turno++;
                    turnoTexto = String.valueOf(turno);
                    huecoTurno.setText(turnoTexto);
                    if (turno % 2 == 0) {
                        huecoJugador.setText("Jugador 2");
                        turnoReal = 1;
                    } else {
                        huecoJugador.setText("Jugador 1");
                        turnoReal = 2;
                    }
                    establecerNumero(2, 0, turnoReal);
                    if (hayGanador(tablero, turnoReal)) {
                        huecoInfo.setText("Hay ganador");
                    }
                    ;
                    if (turnoReal == 1) {
                        boton20.setText("X");
                    } else {
                        boton20.setText("O");
                    }
                } else {
                    huecoInfo.setText("Casilla Ocupada");
                }

            }
        });
        boton21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (casillaOcupada(2, 1)) {
                    turno++;
                    turnoTexto = String.valueOf(turno);
                    huecoTurno.setText(turnoTexto);
                    if (turno % 2 == 0) {
                        huecoJugador.setText("Jugador 2");
                        turnoReal = 1;
                    } else {
                        huecoJugador.setText("Jugador 1");
                        turnoReal = 2;
                    }
                    establecerNumero(2, 1, turnoReal);
                    if (hayGanador(tablero, turnoReal)) {
                        huecoInfo.setText("Hay ganador");
                    }
                    ;
                    if (turnoReal == 1) {
                        boton21.setText("X");
                    } else {
                        boton21.setText("O");
                    }
                } else {
                    huecoInfo.setText("Casilla Ocupada");
                }

            }
        });
        boton22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (casillaOcupada(2, 2)) {
                    turno++;
                    turnoTexto = String.valueOf(turno);
                    huecoTurno.setText(turnoTexto);
                    if (turno % 2 == 0) {
                        huecoJugador.setText("Jugador 2");
                        turnoReal = 1;
                    } else {
                        huecoJugador.setText("Jugador 1");
                        turnoReal = 2;
                    }
                    establecerNumero(2, 2, turnoReal);
                    if (hayGanador(tablero, turnoReal)) {
                        huecoInfo.setText("Hay ganador");
                    }
                    ;
                    if (turnoReal == 1) {
                        boton22.setText("X");
                    } else {
                        boton22.setText("O");
                    }
                } else {
                    huecoInfo.setText("Casilla Ocupada");
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tablero");
        frame.setContentPane(new Tablero().Tablero);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
