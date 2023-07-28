package com.example.customermanagement;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Le Cong Hoan Thien","23/05/17","Hue","data:image/jpeg;base64,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"));
        customerList.add(new Customer("Le Cong Hoan b","23/07/13","DN","data:image/jpeg;base64,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"));
        customerList.add(new Customer("Le Cong Hoan a","23/13/27","SG","data:image/jpeg;base64,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"));
        customerList.add(new Customer("Le Cong Hoan c","21/03/25","QB","data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAoHCBYVFRgWFRYZFhYaHBgcGhkcGBgcHBwcGhgaHhwaHBocIS4lHCErHxoaJjgmKy8xNjY1GiQ7QDs0Py40NTEBDAwMEA8QHhISGjEhISE0NDQ0NDQ2NDQ0NDQ0MTQ0NDQ0MTQxNDQ0NDQ0MTQ0NDQ0NDU0NDQxNDE0NDQ0NDQ9NP/AABEIAK4BIgMBIgACEQEDEQH/xAAcAAEAAgMBAQEAAAAAAAAAAAAABgcDBAUBAgj/xABBEAACAQIDBAgDBQUGBwAAAAABAgADEQQSIQUxQVEGByJhcYGRoRMyQlJigrHBcpKi4fAUIySywvElQ2ODk9HS/8QAGAEBAQEBAQAAAAAAAAAAAAAAAAECAwT/xAAeEQEBAQEAAgMBAQAAAAAAAAAAAQIRITESIkEDYf/aAAwDAQACEQMRAD8AtuIiVCIiAiIgIiICIiAiIgIicPpd0hXA4c1DYu3ZpqeLcz91RqfIcYGv0t6X0cCtj26xF1pg8PtMfpHueEqraPT/AB1a4+L8NeVMBP4vm95F9o45qlRmdizMczMdSSeJMxIrHcCZnrUjsrtfEHX49UnT/mPfu1vOhgelWNpNmTEVDzV3NRT5Pe3lORhdmVnOZVNu4Gdqh0brAZsjnvykgekl1xuZ7+JjsPrOBIXGJl/6lMG276qZJPmt/CWJhsQlRFdGV0YXVlNwR4z8+19mtf13zsdDukFTA1bEk4dj/eJyv9ajgw9xpysmus3K74niOCAQQQQCCNxB3ET2bYIiICIiAiIgIiICIiAiIgIiICIiAiIgIiICIiAiIgIiICIiAlI9Z+PfEY96QNkoBEH7TKHY+rAfhEu6fn3pVX/x2JPE16v8LFR7LM69NZnll2L0cQkNUNxpoP1lhbJ2VRQZVppp3CRLY1TMBJrst7Gx5ThbbXpkknh3MPhhuCgeQEztSsJ84c6TMxlYQ3bOyEZybWvvtIxj9mWBIGg/KWDtWgzkZR/XnODtDCldGHA3H5xKtd7oDjTUwiqTdqbNT8lsV/hYDykkkE6umyPiKR4hHHkWVvzSTud56cNTlIiJWSIiAiIgIiICIiAiIgIiICIiAiIgIiICIiAiIgIiICIiBydlbXNZcxUL93W47j3yk+nVHJj8RyLlx35wH/1SzhV+Djq1IMAGIqKOWcXYfvZvIiRbrXwgtRrqBmJKN5Asp/Ocpq95Xe5nPlHE6PYvWx4Wk8w7gMCDpYe4lSYTHFDclfC+vtJl0d22MTUWkNGtb0N5jWb7bzqelkU8SFW5YAd5mOhtuk5spzeFpD9u7OqKO1ncC5AzWXuvuvOTsrZ+JNRclXIpyllUanVbi47gw475J5LFmrWDHSczbyWUNw3Hwm/gMIyoA7Fjpv3z3aOHDoynlp48I9Dj7A2a9KqcSW0KOgTLdmDMhBOvDJ7yW4LFCouYCxBIIO8Ef0JxHxLUVRyl0KgE2uVFgB4fznV2UAVZxudrjwygTeNXvGN5nOt6IidnAiIgIiICIiAiIgIiICIiAiIgIiICIiAiIgIiICIiAiJ6IFS7dxdtrV7H5fhKf/Eh/WbPWGpfACoDcK6X/EHXT+uMilPEvicXWxABKvUcgjcFzWQNy7IUSYbUwz1NkupuGUBmUjXsOSb+A18pwt+z08+ir8DhkbUqWtxJtOl0RYU8chGm8eomDZpGUjcZk6O4XNi1LG2W7DvtwmrfaZnpej01cWYXBAmlRw/w27O7wHoYG0aYCK1RQzjsqSATbfbnaZAWvrOfXTjopV01Gs0cU99J9gmY3HGS1JGfJmXKRdbWIsd06WFSyAefrrOZsdXdWL6KrsABvYXuLnlrOzOv88/rl/TX4RETq4kREBERAREQEREBERAREQEREBERAREQEREBERAREQEwY7ECnTdzuRHb91Sf0meQrrO2yKWFNFGX4lU5WFxdUGrEjhfsr+IwqtdmVkwqZ07Va3zX3EjlLC6HbRWpQJqNmJBzXtrfeCOXCU01YqeckfRnaDNUUuuSkCDUbNYActePdOGpydejHm8Yek+zjhMSyWsjj4lPW4yOTl9CCLd04qY10e9Nip3XFv1lm9YFOhjkw4w9RPjoxXtMV7DC9tAb2ZVtyuZBdsdH8RhMi1EAZicrr2lO75SePiJqWJyrI6MOcqrXys2VXDkKBc8PGSdMSh+pT3gg6yrdiIiIvxGdje5Ut2fCy6Hzk22a+H+ikov9wfmBObrZOJKVFpp4h7TxKhtpumsj5303L7n+UzWWOr0vw+ErJhsRennUOtXegNypVuK/L82o11tJajAgEEEEAgg3BB3EEbxKR6307eGcfZqKT4FSB7n0mv1edN2wbrRrMWwrm2pJ+CT9S/cv8y+JGt7+jF+scNz7Ve8TxWBAIIIOoI1BB3EHjPZtzIiICIiAiIgIiICIiAiIgIiICIiAiIgIiICIiAgm2p0Ex4isqIzuwRFBLMxsABvJMpbrD6wjiVbDYa6UD877mqD7NvpQ77bzxtqIVtdP+sdnc4bAvan8r10PacneKbD5UHFhqeFhqYE72ARddbseLMd5J4znYQ2JPGbStM1rMbuEwTVNBwmyNnVtFVSQTbTdea2ExVRfk4902/7ViLWJKiYrpl0sBsipTcVXIVF1LlgALcydBNrpp0up4hKNGk2ZkJZ3+m+WwCnjvJ0m30Yx1KmpFR2bMO0pUMlgeIYHjO5XXZzgh6GHZWGjKgVu/VQCpEx8vPmOlzeclRXoyMxZnN2AOW+7yk62VthcgDkAyPNs/AL2adWsnH51fS3y3dTpxmzgsFRdgq1Xa5AzEJp6WuJLYsl4kOJ2j8TsU9RxImzhUCJNfC0/hE0yBdfqG4jnM1asLaTIhvWZSD4XNxpujDwN1I9Gv5SrEMsvpzX/AMM6/a/SVks7/wA/Tjv2uDql6W5gMDWbtC/9nY8VGppX5jUr3XHAS05+UaVRlZWUlWUhlYGxVgbhgeBBF790/QvQDpOcdh71Blr08oqCxAYOCUqKOTBT3XBtpadHJKYiIQiIgIiICIiAiIgIiICIiAiIgIiICIiAiJEus7a5w2AqMhs9QrSQ8e3fMR+BWgV11pdNDiKjYai39xTazEbqjrvPeqnQd4J5Sunb9J5WfMxJ4kn1N54ZFZcMe1OtQA3zmYNQXAJA7ybSW4bZWdRlKseV5nTeY18C65wTuBvbdJZSxdB966crTk0NiEnkZ1sNslKSFqjAKN7McoA7yZh0n+tbE08Oxyopud5vYTt4Xozh2VR8S3G2u/x0kW2jtjBIbKzVG+4Lj95rA+V5iodMaSEWSqBxuqMLeGaS50vzylO0OiLhrp8Jk4M1VkY9xXIQPWfWF2LVTKwSnpbdV9tVAkcxHWDSIyhKpXl2AP8AMZtbA2uuLZkVXUqpaxINxe3A8NJLnUXOs3x1KauJqq16yZM3y7iCBpowNjPpq5IA5zjbV2qwppQysO3e5O7S1h6n0nYw1Em3gPWYrfEW6W086qvf7Df7AyuKgszeJl0bd2QaWHerU0dhkReKhj2mPeRfTgL89KexFMByXvqbhB81juufpHqe6d8SyPPuy18UEv2mF1va3FiPpHIczy77Tv7E6QYnDOz06hDPlzg9pWCiyqyneFGg5DdOWtS4N1tlGgGgAvuHrPljOkYq4Ng9Z1J7LiUNJvtpdk8SvzL5Xk+wuKSogem6uh3MpBHtPzBmM6mxdv18M+ai7JzG9T+0p0PnLxl+kIlf9HusulUAXEr8Jvtrcp5jevvJ3hsQjqHR1dDuZSGB8CJBliIgIiICIiAiIgIiICIiAiIgIiICVb13Yy9KjQFic3xDzBAZV8iPieJHdLSlEdbWOD450G9EpID95B8X8qxHiIFeGeqeEyGncXG7ly5zHaRXpSFBG4keBImRH5i8zpUX7PvDUkv7x8UKb77lRe97ka89N5mxiSSBmZn32zEnu47opsXOu4TM4zX7gCPKWQ1z1GkV1nrJeZ3p2a09RbmVhqGl/KTTqmqMuPp2O9aikbtCFIHraRV1ykyQ9AKjJiQyC7BXIHOxU2hV+VMHQdrvRRmHFkUm/jaZ8iJqqAeAUe++KdQVaauvEAzU2hisqEngJORe1CesnalqYBsQLsV4G1lCnxLDXxlNZGYF21ud/Mn/AGPpJV022kargfSCT420H+ZpHqF3ZVAsg1I/MyozJRshJ3ke0+cFQzrlHzDj3TPiaoN7WFtJhwOMWmSd5MK18WmQ2nxh6bObKLmeVqhd78zJbsbZ/wANe18xFz3d0nSTqM1EZCAd87PR7pHXwTh6ZuhPbpknKw13jgdDZhqLeU1dprmrqPvAe89xOHsKY7mv5N/NpU4/QWxdq08VRStSN0YbjvVhoyN3g6f7zelK9Ue3TTxbYZj2K4JUcBURSQRyzICD+ysuqRCIiAiIgIiICIiAiIgIiICIiAn5r6cVS+0cXc6iu4HdlIQeyrP0qPWfk/aNZ3rVHfR2d2buZmJYepIgYwWUkjQg9ocj4f1+U26dEVB2Pm4p+o7v60nzQdX1Nw40uNbjdqOI4TdXZB0IcdxH5iFc9sIRe9xbfpun1RoA7z7frNnGOUaysTYWJv8AlbhNU1bSjZqsqgKvnPjDVO36CaT1OJ3z6w76wN3EIUcqd3Dw4Taw1IGbO0cPnopVHAZW8txnOoVCpgb2MwmlxvA3cxO11a0gcfT5WY+ek4FTGE24fnJV1XIWxjMPoQtu8Yotvo++UNSP0k28Lm3tNXpWuWk54ZSfaZlGTEkjcwmfbVH4q/DG+2Y/6R5kE/hkVQW1aJNNHI1Ka+K1Wv7MJqI2RNN5kjxFFQ+RwbB6lM/9xMwHjenI7tFApyKb+I1liOa7kmfGQmblDCMx0Fz4SU7E2GFOZhqPzkqyNboxsTdUcEAfKDz5zvGnZ+4zLjq4QBB/V54GzKOYkaiN7Uw/9+hH2lPoRNfa7Zfic87ovhmYH1Vz6Tu4mhmdTu1Ejm2KwNdwdyu/56e5PrLErU6P4n4WMwz3tlrUiT90uob+Ekec/TpE/Kdca3n6O6FbY/teCo1ibvlyP+2hysfO2b8UtYd2IiQIiICIiAiIgIiICIiAiIgez83dYex3w+Prrlsru1VDwKVGLX8iSv4Z+kJqbQ2bSrrlqor23EgXHgYH5TGmo38COHnOxhdo5hYgBuNtA3eBuB5iXDtTq7w2bMmHDX4K5Q/uns+kwp1a0ipKKlByLBzd2XvsSVJ9IVS2JcZjaazPN7HLkLJlt2m7TA5yLm17my+A8yZzm3QEyUTrMc+kiCcbBQVMO6Hu9zI/iKBR2RtCN3hOt0YxGUMDuJHtOt0g2R8RPiJ849xDXPCHD1lpdTODBbEORwCeTW/+WlWvcHUWMubqZw9sPVf7TqP3cx/1CWspRi1s1N+XZPlp+k9RyQH+0b/htZR6C/mZq46s71HoqnYU3L5tRmIOg9fSb9L5QJBVvT7A5KtRl0+Iq1F/aQ2b+FjOJsvAoWJftHQ3PK0m3T+nb4bEXAbKfBwVI9DIpsR86LuzKMp/CxEK6FLBIpuABpv7++batlQ28ZjdrnSZL3/dPsP5SVY4mIr53950cOchW/8AV5HaIOY6XIYi9iTru04aaTtNTqEC43WIvYfz3RYRu1aOt+EgppGpWcqL3dteA13mSzaGMyoddbSHYN2IKgm7MdBe5OnLU+UuSsG1gM9lNwAB58ZZnUhtC64nDk7ilVR+0Mj+mVP3pXW1aaU0Cb3Orm47PJdOPOdvqoxhp7SpDhUWpTPgULj+JFlYfoCIiQIiICIiAiIgIiICIiAiIgIiICIiBRXW3s0UsazqtlqUVfuzZ2VvWw9ZXbS5uvCiBSoVOJZk8tH/ADlMtCvDPsb58T6SIOvgK2W0sHA4gPQ77Ss6J1ku2DiTlynURVlaW3cFl7Y5nwNpcnVnhTT2elx2mLNbyCj/ACyuOkuEGSio0Luqk+NtfeXDsFBTprTHyqoA8hBUdGNqGtUf+zvnKoAmbUAhrtqAD8p/9ztYYtYZhY2Fxe9iRqJ7jKTDFBhbKUF9SCLZgLC2vzcx5z13iIi/T6nmoE8QQfQyCbOISu4+VXIcAbrVFDad1zaWD0rN6TDulYsxV6e7VCNPuPcE9/aHpKJQF1nuexF+fsRCVCSL77A+14xFPTymW0brrkc35/rO98W6KZxukbWK94mTZOJLUwDw0i+kntr9IKoCW5zlbDcBHI0a51A7RFhpfgJl6QvrOLgsay50UkB1sfX+R9ZYl9vjEVMzEmd3q9H/ABLC6gAVL3Jt9LADzJA85HCZtbMQtUUKxVrghhvBvoR3ggHylZfqaJztgY5q2Gp1HtnZbPbQFgSpIHAEgm3fOjIEREBERAREQP/Z"));
        request.setAttribute("nhan", customerList);
        request.getRequestDispatcher("info.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
