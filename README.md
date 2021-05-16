DOCKER-COMPOSE

How to install Docker compose in EC2?
sudo curl -L https://github.com/docker/compose/releases/download/1.21.0/docker-compose-`uname -s`-`uname -m` | sudo tee /usr/local/bin/docker-compose > /dev/null

For Permission
sudo chmod +x /usr/local/bin/docker-compose

Create a symbolic link
ln -s /usr/local/bin/docker-compose /usr/bin/docker-compose

Check Docker compose version
docker-compose --version

REF: https://acloudxpert.com/how-to-install-docker-compose-on-amazon-linux-ami/


Build and start service
docker-compose up -d --build

Stop all service and remove all images
docker-compose down

To check all containers
docker-compose ps

To check all images
docker-compose images
