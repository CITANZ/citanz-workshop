FROM bingc/testcafe_base:latest

RUN wget -q -O - https://dl-ssl.google.com/linux/linux_signing_key.pub | apt-key add - \
    && echo 'deb [arch=amd64] http://dl.google.com/linux/chrome/deb/ stable main' | tee /etc/apt/sources.list.d/google-chrome.list \
    && apt-get update \ 
    && apt-get install apt-utils google-chrome-stable -y \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*