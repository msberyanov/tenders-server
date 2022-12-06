FROM node:slim

WORKDIR /book-library-frontend/

COPY public ./public
COPY src ./src
COPY package.json .

RUN npm install
RUN npm run build
RUN npm install -g serve

CMD serve -s build

EXPOSE 3000



