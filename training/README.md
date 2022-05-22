# Docker

Build
```
docker build -t twayn/ex:latest .
```

Push
```
docker push mi 
```

# Minikube

Start
```
minikube start 
```

Stop

```
minikube stop 
```

Status

```
minikube status 
```

# Kubectl

Version

```
kubectl version 
```

Nodes

```
kubectl get nodes 
```

Pods

```
kubectl get pods
```

Services

```
kubectl get services 
```

Replica Set

```
kubectl get replicaset 
```

Configure dashboard

```
minikube dashboard
minikube dashboard --url
```

or

```
kubectl apply -f https://raw.githubusercontent.com/kubernetes/dashboard/v2.5.0/aio/deploy/recommended.yaml
kubectl proxy 
http://localhost:8001/api/v1/namespaces/kubernetes-dashboard/services/https:kubernetes-dashboard:/proxy/
kubectl describe secret
kubectl create clusterrolebinding default-admin --clusterrole cluster-admin --serviceaccount=default:default
```

# Deployment

Create image
```
./gradlew buiild
docker build -t twayn-ex:latest . 
to check (docker run --rm -p 8080:8080 twayn-ex:latest)
```

Create deployment

```
kubectl create deployment twayn-ex --image=twayn/ex:latest
```

Delete deployment

```
kubectl delete deploy twayn-ex
```

Edit deployment

```
kubectl edit deployment twayn-ex
```

Show logs (for pod with name twayn-ex-6b75bb7bf8-xvwcm)
```
kubectl logs twayn-ex-6b75bb7bf8-xvwcm   
```

Describe pod (for pod with name twayn-ex-6b75bb7bf8-xvwcm)kube

```
kubectl describe pod twayn-ex-6b75bb7bf8-xvwcm
```

Run terminal (inside pod twayn-ex-6b75bb7bf8-xvwcm)
```
 kubectl exec -it twayn-ex-6b75bb7bf8-xvwcm -- bin/bash
```

# Deployment with config
Create deployment
```
 kubectl apply -f ./Deployment.yaml
```

Describe service
```
kubectl describe service twayn-ex-service
```

Describe pod with details
```
kubectl get pod -o wide
```

Describe deployment to yaml
```
kubectl get deployment twayn-ex -o yaml
```

Delete deployment with file
```
 kubectl delete -f ./Deployment.yaml
```