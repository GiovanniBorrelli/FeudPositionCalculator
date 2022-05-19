package Position;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PositionCalculator
 */
@WebServlet("/PositionCalculator")
public class PositionCalculator extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public PositionCalculator() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.setContentType("text/html");        
        String cA1 = request.getParameter("cA1");
        String pA1 = request.getParameter("pA1");
        String hpA1 = request.getParameter("hpA1");
        String cA2 = request.getParameter("cA2");
        String pA2 = request.getParameter("pA2");
        String hpA2 = request.getParameter("hpA2");
        String cA3 = request.getParameter("cA3");
        String pA3 = request.getParameter("pA3");
        String hpA3 = request.getParameter("hpA3");
        String cA4 = request.getParameter("cA4");
        String pA4 = request.getParameter("pA4");
        String hpA4 = request.getParameter("hpA4");
        String cB1 = request.getParameter("cB1");
        String pB1 = request.getParameter("pB1");
        String hpB1 = request.getParameter("hpB1");
        String cB2 = request.getParameter("cB2");
        String pB2 = request.getParameter("pB2");
        String hpB2 = request.getParameter("hpB2");
        String cB3 = request.getParameter("cB3");
        String pB3 = request.getParameter("pB3");
        String hpB3 = request.getParameter("hpB3");
        String cB4 = request.getParameter("cB4");
        String pB4 = request.getParameter("pB4");
        String hpB4 = request.getParameter("hpB4");
        String cC1 = request.getParameter("cC1");
        String pC1 = request.getParameter("pC1");
        String hpC1 = request.getParameter("hpC1");
        String cC2 = request.getParameter("cC2");
        String pC2 = request.getParameter("pC2");
        String hpC2 = request.getParameter("hpC2");
        String cC3 = request.getParameter("cC3");
        String pC3 = request.getParameter("pC3");
        String hpC3 = request.getParameter("hpC3");
        String cC4 = request.getParameter("cC4");
        String pC4 = request.getParameter("pC4");
        String hpC4 = request.getParameter("hpC4");
        String cD1 = request.getParameter("cD1");
        String pD1 = request.getParameter("pD1");
        String hpD1 = request.getParameter("hpD1");
        String cD2 = request.getParameter("cD2");
        String pD2 = request.getParameter("pD2");
        String hpD2 = request.getParameter("hpD2");
        String cD3 = request.getParameter("cD3");
        String pD3 = request.getParameter("pD3");
        String hpD3 = request.getParameter("hpD3");
        String cD4 = request.getParameter("cD4");
        String pD4 = request.getParameter("pD4");
        String hpD4 = request.getParameter("hpD4");
        String turn = request.getParameter("turn");
        int WP = 0;
        int BP = 0;
        int tmp = 0;

        if (!"0HP".equals(hpA2)) {
            if (cA1.equals(cA2)) {
                tmp = tmp + 25;
            }
            if (cA2.equals(cA3)) {
                tmp = tmp + 25;
            }
            if (cA2.equals(cB2)) {
                tmp = tmp + 25;
            }
            if ("Knight".equals(pA2)) {
                tmp = tmp + 30;
            } else if ("Archer".equals(pA2)) {
                tmp = tmp + 45;
            } else if ("Healer".equals(pA2)) {
                tmp = tmp + 50;
            } else if ("Shield".equals(pA2)) {
                tmp = tmp + 35;
            } else if ("Wizard".equals(pA2)) {
                tmp = tmp + 45;
            } else if ("Knight".equals(pA2)) {
                tmp = tmp + 30;
            } else if ("King".equals(pA2)) {
                if ("2HP".equals(hpA2)) {
                    tmp = tmp + 75;
                } else if ("3HP".equals(hpA2)) {
                    tmp = tmp + 125;
                } else if ("4HP".equals(hpA2)) {
                    tmp = tmp + 155;
                }
            }

            if ("1HP".equals(hpA2)) {
                tmp = tmp + 15;
            } else if ("2HP".equals(hpA2)) {
                tmp = tmp + 30;
            } else if ("3HP".equals(hpA2)) {
                tmp = tmp + 45;
            } else if ("4HP".equals(hpA2)) {
                tmp = tmp + 60;
            }

            if ("Black".equals(cA2)) {
                BP = BP + tmp;
            } else {
                WP = WP + tmp;
            }
        }
        tmp = 0;

        if (!"0HP".equals(hpA1)) {
            if (cA1.equals(cA2)) {
                tmp = tmp + 25;
            }
            if (cA1.equals(cB1)) {
                tmp = tmp + 25;
            }
            if ("Knight".equals(pA1)) {
                tmp = tmp + 30;
            } else if ("Archer".equals(pA1)) {
                tmp = tmp + 45;
            } else if ("Healer".equals(pA1)) {
                tmp = tmp + 50;
            } else if ("Shield".equals(pA1)) {
                tmp = tmp + 35;
            } else if ("Wizard".equals(pA1)) {
                tmp = tmp + 45;
            } else if ("Knight".equals(pA1)) {
                tmp = tmp + 30;
            } else if ("King".equals(pA1)) {
                if ("2HP".equals(hpA1)) {
                    tmp = tmp + 75;
                } else if ("3HP".equals(hpA1)) {
                    tmp = tmp + 125;
                } else if ("4HP".equals(hpA1)) {
                    tmp = tmp + 155;
                }
            }

            if ("1HP".equals(hpA1)) {
                tmp = tmp + 15;
            } else if ("2HP".equals(hpA1)) {
                tmp = tmp + 30;
            } else if ("3HP".equals(hpA1)) {
                tmp = tmp + 45;
            } else if ("4HP".equals(hpA1)) {
                tmp = tmp + 60;
            }

            if ("Black".equals(cA1)) {
                BP = BP + tmp;
            } else {
                WP = WP + tmp;
            }
        }
        tmp = 0;

        if (!"0HP".equals(hpA3)) {
            if (cA3.equals(cA2)) {
                tmp = tmp + 25;
            }
            if (cA3.equals(cA4)) {
                tmp = tmp + 25;
            }
            if (cA3.equals(cB3)) {
                tmp = tmp + 25;
            }
            if ("Knight".equals(pA3)) {
                tmp = tmp + 30;
            } else if ("Archer".equals(pA3)) {
                tmp = tmp + 45;
            } else if ("Healer".equals(pA3)) {
                tmp = tmp + 50;
            } else if ("Shield".equals(pA3)) {
                tmp = tmp + 35;
            } else if ("Wizard".equals(pA3)) {
                tmp = tmp + 45;
            } else if ("Knight".equals(pA3)) {
                tmp = tmp + 30;
            } else if ("King".equals(pA3)) {
                if ("2HP".equals(hpA3)) {
                    tmp = tmp + 75;
                } else if ("3HP".equals(hpA3)) {
                    tmp = tmp + 125;
                } else if ("4HP".equals(hpA3)) {
                    tmp = tmp + 155;
                }
            }

            if ("1HP".equals(hpA3)) {
                tmp = tmp + 15;
            } else if ("2HP".equals(hpA3)) {
                tmp = tmp + 30;
            } else if ("3HP".equals(hpA3)) {
                tmp = tmp + 45;
            } else if ("4HP".equals(hpA3)) {
                tmp = tmp + 60;
            }

            if ("Black".equals(cA3)) {
                BP = BP + tmp;
            } else {
                WP = WP + tmp;
            }
        }
        tmp = 0;

        if (!"0HP".equals(hpA4)) {
            if (cA3.equals(cA4)) {
                tmp = tmp + 25;
            }
            if (cA4.equals(cB4)) {
                tmp = tmp + 25;
            }
            if ("Knight".equals(pA4)) {
                tmp = tmp + 30;
            } else if ("Archer".equals(pA4)) {
                tmp = tmp + 45;
            } else if ("Healer".equals(pA4)) {
                tmp = tmp + 50;
            } else if ("Shield".equals(pA4)) {
                tmp = tmp + 35;
            } else if ("Wizard".equals(pA4)) {
                tmp = tmp + 45;
            } else if ("Knight".equals(pA4)) {
                tmp = tmp + 30;
            } else if ("King".equals(pA4)) {
                if ("2HP".equals(hpA4)) {
                    tmp = tmp + 75;
                } else if ("3HP".equals(hpA4)) {
                    tmp = tmp + 125;
                } else if ("4HP".equals(hpA4)) {
                    tmp = tmp + 155;
                }
            }

            if ("1HP".equals(hpA4)) {
                tmp = tmp + 15;
            } else if ("2HP".equals(hpA4)) {
                tmp = tmp + 30;
            } else if ("3HP".equals(hpA4)) {
                tmp = tmp + 45;
            } else if ("4HP".equals(hpA4)) {
                tmp = tmp + 60;
            }

            if ("Black".equals(cA4)) {
                BP = BP + tmp;
            } else {
                WP = WP + tmp;
            }
        }
        tmp = 0;


        if (!"0HP".equals(hpB1)) {
            if (cA1.equals(cB1)) {
                tmp = tmp + 25;
            }
            if (cC1.equals(cB1)) {
                tmp = tmp + 25;
            }
            if (cB2.equals(cB1)) {
                tmp = tmp + 25;
            }
            if ("Knight".equals(pB1)) {
                tmp = tmp + 30;
            } else if ("Archer".equals(pB1)) {
                tmp = tmp + 45;
            } else if ("Healer".equals(pB1)) {
                tmp = tmp + 50;
            } else if ("Shield".equals(pB1)) {
                tmp = tmp + 35;
            } else if ("Wizard".equals(pB1)) {
                tmp = tmp + 45;
            } else if ("Knight".equals(pB1)) {
                tmp = tmp + 30;
            } else if ("King".equals(pB1)) {
                if ("2HP".equals(hpB1)) {
                    tmp = tmp + 75;
                } else if ("3HP".equals(hpB1)) {
                    tmp = tmp + 125;
                } else if ("4HP".equals(hpB1)) {
                    tmp = tmp + 155;
                }
            }

            if ("1HP".equals(hpB1)) {
                tmp = tmp + 15;
            } else if ("2HP".equals(hpB1)) {
                tmp = tmp + 30;
            } else if ("3HP".equals(hpB1)) {
                tmp = tmp + 45;
            } else if ("4HP".equals(hpB1)) {
                tmp = tmp + 60;
            }

            if ("Black".equals(cB1)) {
                BP = BP + tmp;
            } else {
                WP = WP + tmp;
            }
        }
        tmp = 0;


        if (!"0HP".equals(hpB2)) {
            if (cA2.equals(cB2)) {
                tmp = tmp + 25;
            }
            if (cC2.equals(cB2)) {
                tmp = tmp + 25;
            }
            if (cB3.equals(cB2)) {
                tmp = tmp + 25;
            }
            if (cB1.equals(cB2)) {
                tmp = tmp + 25;
            }
            if ("Knight".equals(pB2)) {
                tmp = tmp + 30;
            } else if ("Archer".equals(pB2)) {
                tmp = tmp + 45;
            } else if ("Healer".equals(pB2)) {
                tmp = tmp + 50;
            } else if ("Shield".equals(pB2)) {
                tmp = tmp + 35;
            } else if ("Wizard".equals(pB2)) {
                tmp = tmp + 45;
            } else if ("Knight".equals(pB2)) {
                tmp = tmp + 30;
            } else if ("King".equals(pB2)) {
                if ("2HP".equals(hpB2)) {
                    tmp = tmp + 75;
                } else if ("3HP".equals(hpB2)) {
                    tmp = tmp + 125;
                } else if ("4HP".equals(hpB2)) {
                    tmp = tmp + 155;
                }
            }
            if ("1HP".equals(hpB2)) {
                tmp = tmp + 15;
            } else if ("2HP".equals(hpB2)) {
                tmp = tmp + 30;
            } else if ("3HP".equals(hpB2)) {
                tmp = tmp + 45;
            } else if ("4HP".equals(hpB2)) {
                tmp = tmp + 60;
            }
            if ("Black".equals(cB2)) {
                BP = BP + tmp;
            } else {
                WP = WP + tmp;
            }
        }
        tmp = 0;

        if (!"0HP".equals(hpB3)) {
            if (cA3.equals(cB3)) {
                tmp = tmp + 25;
            }
            if (cC3.equals(cB3)) {
                tmp = tmp + 25;
            }
            if (cB4.equals(cB3)) {
                tmp = tmp + 25;
            }
            if (cB2.equals(cB3)) {
                tmp = tmp + 25;
            }
            if ("Knight".equals(pB3)) {
                tmp = tmp + 30;
            } else if ("Archer".equals(pB3)) {
                tmp = tmp + 45;
            } else if ("Healer".equals(pB3)) {
                tmp = tmp + 50;
            } else if ("Shield".equals(pB3)) {
                tmp = tmp + 35;
            } else if ("Wizard".equals(pB3)) {
                tmp = tmp + 45;
            } else if ("Knight".equals(pB3)) {
                tmp = tmp + 30;
            } else if ("King".equals(pB3)) {
                if ("2HP".equals(hpB3)) {
                    tmp = tmp + 75;
                } else if ("3HP".equals(hpB3)) {
                    tmp = tmp + 125;
                } else if ("4HP".equals(hpB3)) {
                    tmp = tmp + 155;
                }
            }
            if ("1HP".equals(hpB3)) {
                tmp = tmp + 15;
            } else if ("2HP".equals(hpB3)) {
                tmp = tmp + 30;
            } else if ("3HP".equals(hpB3)) {
                tmp = tmp + 45;
            } else if ("4HP".equals(hpB3)) {
                tmp = tmp + 60;
            }
            if ("Black".equals(cB3)) {
                BP = BP + tmp;
            } else {
                WP = WP + tmp;
            }
        }
        tmp = 0;

        if (!"0HP".equals(hpB4)) {
            if (cA4.equals(cB4)) {
                tmp = tmp + 25;
            }
            if (cC4.equals(cB4)) {
                tmp = tmp + 25;
            }
            if (cB3.equals(cB4)) {
                tmp = tmp + 25;
            }
            if ("Knight".equals(pB4)) {
                tmp = tmp + 30;
            } else if ("Archer".equals(pB4)) {
                tmp = tmp + 45;
            } else if ("Healer".equals(pB4)) {
                tmp = tmp + 50;
            } else if ("Shield".equals(pB4)) {
                tmp = tmp + 35;
            } else if ("Wizard".equals(pB4)) {
                tmp = tmp + 45;
            } else if ("Knight".equals(pB4)) {
                tmp = tmp + 30;
            } else if ("King".equals(pB4)) {
                if ("2HP".equals(hpB4)) {
                    tmp = tmp + 75;
                } else if ("3HP".equals(hpB4)) {
                    tmp = tmp + 125;
                } else if ("4HP".equals(hpB4)) {
                    tmp = tmp + 155;
                }
            }
            if ("1HP".equals(hpB4)) {
                tmp = tmp + 15;
            } else if ("2HP".equals(hpB4)) {
                tmp = tmp + 30;
            } else if ("3HP".equals(hpB4)) {
                tmp = tmp + 45;
            } else if ("4HP".equals(hpB4)) {
                tmp = tmp + 60;
            }
            if ("Black".equals(cB4)) {
                BP = BP + tmp;
            } else {
                WP = WP + tmp;
            }
        }
        tmp = 0;

        if (!"0HP".equals(hpC4)) {
            if (cB4.equals(cC4)) {
                tmp = tmp + 25;
            }
            if (cD4.equals(cC4)) {
                tmp = tmp + 25;
            }
            if (cC3.equals(cC4)) {
                tmp = tmp + 25;
            }
            if ("Knight".equals(pC4)) {
                tmp = tmp + 30;
            } else if ("Archer".equals(pC4)) {
                tmp = tmp + 45;
            } else if ("Healer".equals(pC4)) {
                tmp = tmp + 50;
            } else if ("Shield".equals(pC4)) {
                tmp = tmp + 35;
            } else if ("Wizard".equals(pC4)) {
                tmp = tmp + 45;
            } else if ("Knight".equals(pC4)) {
                tmp = tmp + 30;
            } else if ("King".equals(pC4)) {
                if ("2HP".equals(hpC4)) {
                    tmp = tmp + 75;
                } else if ("3HP".equals(hpC4)) {
                    tmp = tmp + 125;
                } else if ("4HP".equals(hpC4)) {
                    tmp = tmp + 155;
                }
            }
            if ("1HP".equals(hpC4)) {
                tmp = tmp + 15;
            } else if ("2HP".equals(hpC4)) {
                tmp = tmp + 30;
            } else if ("3HP".equals(hpC4)) {
                tmp = tmp + 45;
            } else if ("4HP".equals(hpC4)) {
                tmp = tmp + 60;
            }
            if ("Black".equals(cC4)) {
                BP = BP + tmp;
            } else {
                WP = WP + tmp;
            }
        }
        tmp = 0;

        if (!"0HP".equals(hpC3)) {
            if (cB3.equals(cC3)) {
                tmp = tmp + 25;
            }
            if (cD3.equals(cC3)) {
                tmp = tmp + 25;
            }
            if (cC2.equals(cC3)) {
                tmp = tmp + 25;
            }
            if (cC4.equals(cC3)) {
                tmp = tmp + 25;
            }
            if ("Knight".equals(pC3)) {
                tmp = tmp + 30;
            } else if ("Archer".equals(pC3)) {
                tmp = tmp + 45;
            } else if ("Healer".equals(pC3)) {
                tmp = tmp + 50;
            } else if ("Shield".equals(pC3)) {
                tmp = tmp + 35;
            } else if ("Wizard".equals(pC3)) {
                tmp = tmp + 45;
            } else if ("Knight".equals(pC3)) {
                tmp = tmp + 30;
            } else if ("King".equals(pC3)) {
                if ("2HP".equals(hpC3)) {
                    tmp = tmp + 75;
                } else if ("3HP".equals(hpC3)) {
                    tmp = tmp + 125;
                } else if ("4HP".equals(hpC3)) {
                    tmp = tmp + 155;
                }
            }
            if ("1HP".equals(hpC3)) {
                tmp = tmp + 15;
            } else if ("2HP".equals(hpC3)) {
                tmp = tmp + 30;
            } else if ("3HP".equals(hpC3)) {
                tmp = tmp + 45;
            } else if ("4HP".equals(hpC3)) {
                tmp = tmp + 60;
            }
            if ("Black".equals(cC3)) {
                BP = BP + tmp;
            } else {
                WP = WP + tmp;
            }
        }
        tmp = 0;

        if (!"0HP".equals(hpC2)) {
            if (cB2.equals(cC2)) {
                tmp = tmp + 25;
            }
            if (cD2.equals(cC2)) {
                tmp = tmp + 25;
            }
            if (cC3.equals(cC2)) {
                tmp = tmp + 25;
            }
            if (cC1.equals(cC2)) {
                tmp = tmp + 25;
            }
            if ("Knight".equals(pC2)) {
                tmp = tmp + 30;
            } else if ("Archer".equals(pC2)) {
                tmp = tmp + 45;
            } else if ("Healer".equals(pC2)) {
                tmp = tmp + 50;
            } else if ("Shield".equals(pC2)) {
                tmp = tmp + 35;
            } else if ("Wizard".equals(pC2)) {
                tmp = tmp + 45;
            } else if ("Knight".equals(pC2)) {
                tmp = tmp + 30;
            } else if ("King".equals(pC2)) {
                if ("2HP".equals(hpC2)) {
                    tmp = tmp + 75;
                } else if ("3HP".equals(hpC2)) {
                    tmp = tmp + 125;
                } else if ("4HP".equals(hpC2)) {
                    tmp = tmp + 155;
                }
            }
            if ("1HP".equals(hpC2)) {
                tmp = tmp + 15;
            } else if ("2HP".equals(hpC2)) {
                tmp = tmp + 30;
            } else if ("3HP".equals(hpC2)) {
                tmp = tmp + 45;
            } else if ("4HP".equals(hpC2)) {
                tmp = tmp + 60;
            }
            if ("Black".equals(cC2)) {
                BP = BP + tmp;
            } else {
                WP = WP + tmp;
            }
        }
        tmp = 0;

        if (!"0HP".equals(hpC1)) {
            if (cB1.equals(cC1)) {
                tmp = tmp + 25;
            }
            if (cD1.equals(cC1)) {
                tmp = tmp + 25;
            }
            if (cC2.equals(cC1)) {
                tmp = tmp + 25;
            }
            if ("Knight".equals(pC1)) {
                tmp = tmp + 30;
            } else if ("Archer".equals(pC1)) {
                tmp = tmp + 45;
            } else if ("Healer".equals(pC1)) {
                tmp = tmp + 50;
            } else if ("Shield".equals(pC1)) {
                tmp = tmp + 35;
            } else if ("Wizard".equals(pC1)) {
                tmp = tmp + 45;
            } else if ("Knight".equals(pC1)) {
                tmp = tmp + 30;
            } else if ("King".equals(pC1)) {
                if ("2HP".equals(hpC1)) {
                    tmp = tmp + 75;
                } else if ("3HP".equals(hpC1)) {
                    tmp = tmp + 125;
                } else if ("4HP".equals(hpC1)) {
                    tmp = tmp + 155;
                }
            }
            if ("1HP".equals(hpC1)) {
                tmp = tmp + 15;
            } else if ("2HP".equals(hpC1)) {
                tmp = tmp + 30;
            } else if ("3HP".equals(hpC1)) {
                tmp = tmp + 45;
            } else if ("4HP".equals(hpC1)) {
                tmp = tmp + 60;
            }
            if ("Black".equals(cC1)) {
                BP = BP + tmp;
            } else {
                WP = WP + tmp;
            }
        }
        tmp = 0;

        if (!"0HP".equals(hpD1)) {
            if (cC1.equals(cD1)) {
                tmp = tmp + 25;
            }
            if (cD2.equals(cD1)) {
                tmp = tmp + 25;
            }

            if ("Knight".equals(pD1)) {
                tmp = tmp + 30;
            } else if ("Archer".equals(pD1)) {
                tmp = tmp + 45;
            } else if ("Healer".equals(pD1)) {
                tmp = tmp + 50;
            } else if ("Shield".equals(pD1)) {
                tmp = tmp + 35;
            } else if ("Wizard".equals(pD1)) {
                tmp = tmp + 45;
            } else if ("Knight".equals(pD1)) {
                tmp = tmp + 30;
            } else if ("King".equals(pD1)) {
                if ("2HP".equals(hpD1)) {
                    tmp = tmp + 75;
                } else if ("3HP".equals(hpD1)) {
                    tmp = tmp + 125;
                } else if ("4HP".equals(hpD1)) {
                    tmp = tmp + 155;
                }
            }
            if ("1HP".equals(hpD1)) {
                tmp = tmp + 15;
            } else if ("2HP".equals(hpD1)) {
                tmp = tmp + 30;
            } else if ("3HP".equals(hpD1)) {
                tmp = tmp + 45;
            } else if ("4HP".equals(hpD1)) {
                tmp = tmp + 60;
            }
            if ("Black".equals(cD1)) {
                BP = BP + tmp;
            } else {
                WP = WP + tmp;
            }
        }
        tmp = 0;

        if (!"0HP".equals(hpD2)) {
            if (cD1.equals(cD2)) {
                tmp = tmp + 25;
            }
            if (cC2.equals(cD2)) {
                tmp = tmp + 25;
            }
            if (cD3.equals(cD2)) {
                tmp = tmp + 25;
            }
            if ("Knight".equals(pD2)) {
                tmp = tmp + 30;
            } else if ("Archer".equals(pD2)) {
                tmp = tmp + 45;
            } else if ("Healer".equals(pD2)) {
                tmp = tmp + 50;
            } else if ("Shield".equals(pD2)) {
                tmp = tmp + 35;
            } else if ("Wizard".equals(pD2)) {
                tmp = tmp + 45;
            } else if ("Knight".equals(pD2)) {
                tmp = tmp + 30;
            } else if ("King".equals(pD2)) {
                if ("2HP".equals(hpD2)) {
                    tmp = tmp + 75;
                } else if ("3HP".equals(hpD2)) {
                    tmp = tmp + 125;
                } else if ("4HP".equals(hpD2)) {
                    tmp = tmp + 155;
                }
            }
            if ("1HP".equals(hpD2)) {
                tmp = tmp + 15;
            } else if ("2HP".equals(hpD2)) {
                tmp = tmp + 30;
            } else if ("3HP".equals(hpD2)) {
                tmp = tmp + 45;
            } else if ("4HP".equals(hpD2)) {
                tmp = tmp + 60;
            }
            if ("Black".equals(cD2)) {
                BP = BP + tmp;
            } else {
                WP = WP + tmp;
            }
        }
        tmp = 0;

        if (!"0HP".equals(hpD3)) {
            if (cD2.equals(cD3)) {
                tmp = tmp + 25;
            }
            if (cC3.equals(cD3)) {
                tmp = tmp + 25;
            }
            if (cD4.equals(cD3)) {
                tmp = tmp + 25;
            }
            if ("Knight".equals(pD3)) {
                tmp = tmp + 30;
            } else if ("Archer".equals(pD3)) {
                tmp = tmp + 45;
            } else if ("Healer".equals(pD3)) {
                tmp = tmp + 50;
            } else if ("Shield".equals(pD3)) {
                tmp = tmp + 35;
            } else if ("Wizard".equals(pD3)) {
                tmp = tmp + 45;
            } else if ("Knight".equals(pD3)) {
                tmp = tmp + 30;
            } else if ("King".equals(pD3)) {
                if ("2HP".equals(hpD3)) {
                    tmp = tmp + 75;
                } else if ("3HP".equals(hpD3)) {
                    tmp = tmp + 125;
                } else if ("4HP".equals(hpD3)) {
                    tmp = tmp + 155;
                }
            }
            if ("1HP".equals(hpD3)) {
                tmp = tmp + 15;
            } else if ("2HP".equals(hpD3)) {
                tmp = tmp + 30;
            } else if ("3HP".equals(hpD3)) {
                tmp = tmp + 45;
            } else if ("4HP".equals(hpD3)) {
                tmp = tmp + 60;
            }
            if ("Black".equals(cD3)) {
                BP = BP + tmp;
            } else {
                WP = WP + tmp;
            }
        }
        tmp = 0;

        if (!"0HP".equals(hpD4)) {
            if (cC4.equals(cD4)) {
                tmp = tmp + 25;
            }
            if (cD3.equals(cD4)) {
                tmp = tmp + 25;
            }
            if ("Knight".equals(pD4)) {
                tmp = tmp + 30;
            } else if ("Archer".equals(pD4)) {
                tmp = tmp + 45;
            } else if ("Healer".equals(pD4)) {
                tmp = tmp + 50;
            } else if ("Shield".equals(pD4)) {
                tmp = tmp + 35;
            } else if ("Wizard".equals(pD4)) {
                tmp = tmp + 45;
            } else if ("Knight".equals(pD4)) {
                tmp = tmp + 30;
            } else if ("King".equals(pD4)) {
                if ("2HP".equals(hpD4)) {
                    tmp = tmp + 75;
                } else if ("3HP".equals(hpD4)) {
                    tmp = tmp + 125;
                } else if ("4HP".equals(hpD4)) {
                    tmp = tmp + 155;
                }
            }
            if ("1HP".equals(hpD4)) {
                tmp = tmp + 15;
            } else if ("2HP".equals(hpD4)) {
                tmp = tmp + 30;
            } else if ("3HP".equals(hpD4)) {
                tmp = tmp + 45;
            } else if ("4HP".equals(hpD4)) {
                tmp = tmp + 60;
            }
            if ("Black".equals(cD4)) {
                BP = BP + tmp;
            } else {
                WP = WP + tmp;
            }
        }

        if ("Black".equals(turn)) {
            BP = BP + 15;
        } else {
            WP = WP + 15;
        }



        double ratioD = (double) BP * 100 / (double)(BP + WP);
        int ratio = BP * 100 / (BP + WP);
        request.setAttribute("ratioD", ratioD);
        request.setAttribute("ratio", ratio);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/ShowResult.jsp");
        dispatcher.forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}