/*
 * This file is part of https://github.com/wtanaka/gradleinclude
 * Copyright (C) 2019 Wesley Tanaka <https://wtanaka.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. See accompanying LICENSE file.
 */

package com.wtanaka.gradleinclude.appenginestandard;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Example App Engine servlet code.
 */
public class AppEngineStandardServlet extends HttpServlet {
    private static final long serialVersionUID = 6449522932459211583L;

    /**
     * Respond to GET.
     * @param request request object
     * @param response response object
     * @throws ServletException Servlet-layer exception
     * @throws IOException Network exception
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println("<h1>hello from"
                + " <a href=\"https://github.com/wtanaka/gradleinclude\">"
                + "gradleinclude</a></h1>");
    }
}
